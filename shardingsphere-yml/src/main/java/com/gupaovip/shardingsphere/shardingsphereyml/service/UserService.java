package com.gupaovip.shardingsphere.shardingsphereyml.service;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.User;
import com.gupaovip.shardingsphere.shardingsphereyml.mapper.UserMapper;
import io.shardingsphere.transaction.annotation.ShardingTransactionType;
import io.shardingsphere.transaction.api.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:UserService
 * Package:com.gupaovip.shardingsphere.shardingsphereyml.service
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 21:24
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @ShardingTransactionType(value = TransactionType.XA)
    @Transactional(rollbackFor = Exception.class)
    public void testTransaction() {
        User user = new User();
        user.setUserId(5L);
        user.setName("StringUtils.EMPTY");
        user.setAge(33);

        userMapper.addOne(user);

        user.setUserId(6L);
        userMapper.addOne(user);
        userMapper.addOne(user);
    }
}
