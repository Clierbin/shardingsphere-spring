package com.gupaovip.shardingsphere.shardingsphereyml.service;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.User;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName:UserTest
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 20:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void addUser(){
        User user = new User();
        user.setName("StringUtils.EMPTY");
        user.setUserId(2674L);
        user.setAge(66);
        userMapper.addOne(user);
    }
}
