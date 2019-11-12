package com.gupaovip.shardingsphere.shardingsphereprop.service;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TOrderDO;

/**
 * ClassName:OrderService
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:46
 */
public interface OrderService {
    void insert();

    TOrderDO getOrderInfoByOrderId(int i);
}
