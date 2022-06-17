# shardingsphere-spring

加一些扩展
shardingjdbc不参与分库分表的配置处理方式
在shardingjdbc3.x和4.x版本的官方文档FAQ中，可以找点如下说明：

6. 如果只有部分数据库分库分表，是否需要将不分库分表的表也配置在分片规则中？

回答：

是的。因为ShardingSphere是将多个数据源合并为一个统一的逻辑数据源。因此即使不分库分表的部分，不配置分片规则ShardingSphere即无法精确的断定应该路由至哪个数据源。 但是ShardingSphere提供了两种变通的方式，有助于简化配置。

方法1：配置default-data-source，凡是在默认数据源中的表可以无需配置在分片规则中，ShardingSphere将在找不到分片数据源的情况下将表路由至默认数据源。
# 不分库也不分表的数据节点配置
spring.shardingsphere.sharding.tables.t_order.actual-data-nodes=ds0.t_order


方法2：将不参与分库分表的数据源独立于ShardingSphere之外，在应用中使用多个数据源分别处理分片和不分片的情况。

在shardingjdbc5.x版本的官方文档FAQ中，关于不参与分库分表的说法，则是不需要配置，框架会自动识别，这样当然就简化了。

对于3.x版本和4.x版本，不需要分库分表的表，如果表数量不多的化，可以通过简单配置的方式，实现对每个表的配置，此时只需要指定为固定的数据源即可，该数据源可以是有序的某个数据源，也可以是单独配置的一个数据源，因为不分表，也就不需要配置分表规则了。

