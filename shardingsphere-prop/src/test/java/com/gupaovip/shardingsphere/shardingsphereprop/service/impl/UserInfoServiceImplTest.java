package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.UserInfoDO;
import com.gupaovip.shardingsphere.shardingsphereprop.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * ClassName:UserInfoServiceImplTest
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserInfoServiceImplTest {

    @Autowired
    private UserInfoService userInfoService;
    @Test
    public void insert() {
        UserInfoDO userInfoDO=new UserInfoDO();
        userInfoDO.setUserName("copy.getUserName()");
        userInfoDO.setUserId(6L);
        userInfoDO.setPassword("copy.getPassword()");
        userInfoDO.setAccount("copy.getAccount()");
        int insert = userInfoService.insert(userInfoDO);
    }

    @Test
    public void select(){
        UserInfoDO userInfo1= userInfoService.getUserInfoByUserId(1L);
        System.out.println("------userInfo1:"+userInfo1);

        UserInfoDO userInfo2= userInfoService.getUserInfoByUserId(2L);
        System.out.println("------userInfo2:"+userInfo2);
    }
}