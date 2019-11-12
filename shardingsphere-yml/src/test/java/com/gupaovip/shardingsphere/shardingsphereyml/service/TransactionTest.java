package com.gupaovip.shardingsphere.shardingsphereyml.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName:TransactionTest
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 21:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TransactionTest {
    @Autowired
    private UserService userService;

    @Test
    public void transTest(){
        userService.testTransaction();
    }
}
