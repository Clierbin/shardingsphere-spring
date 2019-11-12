package com.gupaovip.shardingsphere.shardingsphereprop.service.impl;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TOrderItemDO;
import com.gupaovip.shardingsphere.shardingsphereprop.mapper.TOrderItemMapper;
import com.gupaovip.shardingsphere.shardingsphereprop.service.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:OrderItemImpl
 * Package:com.gupaovip.shardingsphere.shardingsphereprop.service.impl
 * description
 * Created by zhangbin on 2019/11/12.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/11/12 15:55
 */
@Service
public class OrderItemImpl implements OrderItem {

    @Autowired
    private TOrderItemMapper tOrderItemMapper;

    @Override
    public void selectOrderAndItem() {
        List<TOrderItemDO> tOrderItemDOS=tOrderItemMapper.selectOrderAndItem();
    }

    @Override
    public void insert() {
        TOrderItemDO tOrderItemDO = new TOrderItemDO();
        tOrderItemDO.setItemId(2);
        tOrderItemDO.setOrderId(2);
        tOrderItemDO.setUserId(2);
        tOrderItemMapper.insert(tOrderItemDO);
    }
}
