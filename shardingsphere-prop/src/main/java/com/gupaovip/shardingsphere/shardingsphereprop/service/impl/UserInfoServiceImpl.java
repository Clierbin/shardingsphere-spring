package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.UserInfoDO;
import com.gupaovip.shardingsphere.shardingsphereprop.mapper.UserInfoMapper;
import com.gupaovip.shardingsphere.shardingsphereprop.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserInfoServiceImpl
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:29
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoDO getUserInfoByUserId(long l) {
        return userInfoMapper.getUserInfoByUserId(l);
    }

    @Override
    public int insert(UserInfoDO userInfoDO) {
        return userInfoMapper.insert(userInfoDO);
    }
}
