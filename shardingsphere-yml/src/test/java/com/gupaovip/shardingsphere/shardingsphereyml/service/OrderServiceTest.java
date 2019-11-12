package com.gupaovip.shardingsphere.shardingsphereyml.service;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.Order;
import com.gupaovip.shardingsphere.shardingsphereyml.entity.OrderItem;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.OrderItemMapper;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * ClassName:OrderServiceTest
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 20:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceTest {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Test
    public void insertData() throws Exception{
        // 插入订单
        Order order = new Order();
        order.setUserId(2673);
        order.setCreateTime(new Date());
        order.setTotalPrice(666);
        orderMapper.addOne(order);
        System.out.println("插入订单id:{"+order.getOrderId()+"}");


        // 插入订单明细
        OrderItem orderItem = new OrderItem();
        orderItem.setUserId(2673);
        orderItem.setOrderId(order.getOrderId());
        orderItem.setName("订单明细");
        orderItem.setPrice(666);
        orderItemMapper.addOne(orderItem);
        System.out.println("插入订单明细id:{"+orderItem.getOrderItemId()+"}");
    }

    /**
     * 查询用户订单
     */
    @Test
    public void selectOrder(){
        List<Order> orderByUserId = orderMapper.getOrderByUserId(2673L);
        for (Order order : orderByUserId) {
            System.out.println(order);
        }
    }
    /**
     * 关联查询
     * 没有使用分片键,会产生笛卡尔积查询
     */
    @Test
    public void selectOrderItem(){
        List<OrderItem> orderItemByPrice = orderItemMapper.getOrderItemByPrice(666);
        for (OrderItem orderItem : orderItemByPrice) {
            System.out.println(orderItem);
        }
    }
}
