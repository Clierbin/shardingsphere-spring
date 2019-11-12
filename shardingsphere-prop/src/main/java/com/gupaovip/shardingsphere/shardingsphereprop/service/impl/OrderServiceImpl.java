package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TOrderDO;
import com.gupaovip.shardingsphere.shardingsphereprop.mapper.TOrderMapper;
import com.gupaovip.shardingsphere.shardingsphereprop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:OrderServiceImpl
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:46
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private TOrderMapper tOrderMapper;


    @Override
    public TOrderDO getOrderInfoByOrderId(int i) {
        return tOrderMapper.selectByPrimaryKey(i);
    }

    @Override
    public void insert() {
        TOrderDO tOrderDO = new TOrderDO();
        tOrderDO.setOrderId(2);
        tOrderDO.setUserId(2);
        tOrderMapper.insert(tOrderDO);
    }

}
