package com.gupaovip.shardingsphere.shardingsphereyml.mapper;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
public interface OrderMapper {

    long addOne(Order order);

    Order selectOne(@Param("order_id") long orderId, @Param("user_id") int userId);

    List<Order> getOrderByUserId(long id);

}
