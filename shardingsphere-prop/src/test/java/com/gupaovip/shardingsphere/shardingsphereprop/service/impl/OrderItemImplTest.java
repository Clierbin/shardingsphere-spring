package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.service.OrderItem;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName:OrderItemImplTest
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderItemImplTest {
    @Autowired
    private OrderItem orderItem;

    @Test
    public void insert() {
        orderItem.insert();
    }

    @Test
    public void selectOrderAndItem(){
        orderItem.selectOrderAndItem();
    }
}