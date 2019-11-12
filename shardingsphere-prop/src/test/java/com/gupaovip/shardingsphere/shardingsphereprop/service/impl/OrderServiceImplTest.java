package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TOrderDO;
import com.gupaovip.shardingsphere.shardingsphereprop.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * ClassName:OrderServiceImplTest
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;
    @Test
    public void insert() {
        orderService.insert();
    }
    @Test
    public void select(){
        TOrderDO order1 = orderService.getOrderInfoByOrderId(1);
        System.out.println("------order1:"+order1);

        TOrderDO order2 = orderService.getOrderInfoByOrderId(2);
        System.out.println("------order2:"+order2);
    }
}