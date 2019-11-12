package com.gupaovip.shardingsphere.shardingsphereyml.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
@Data
public class Order {

  private long orderId;
  private long userId;
  private Date createTime;
  private long totalPrice;

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(long totalPrice) {
    this.totalPrice = totalPrice;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", userId=" + userId +
            ", createTime=" + createTime +
            ", totalPrice=" + totalPrice +
            '}';
  }
}
