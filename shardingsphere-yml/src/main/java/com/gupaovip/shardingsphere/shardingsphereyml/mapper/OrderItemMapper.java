package com.gupaovip.shardingsphere.shardingsphereyml.mapper;


import com.gupaovip.shardingsphere.shardingsphereyml.entity.OrderItem;

import java.util.List;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
public interface OrderItemMapper {

    void addOne(OrderItem orderItem);

    List<OrderItem> getByOrderId(int id);

    List<OrderItem> getOrderItemByPrice(int price);


}
