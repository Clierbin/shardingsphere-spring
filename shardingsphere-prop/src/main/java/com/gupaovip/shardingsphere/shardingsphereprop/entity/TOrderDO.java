package com.gupaovip.shardingsphere.shardingsphereprop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class TOrderDO implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    private Integer orderId;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    private Integer userId;

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column ds0..t_order.order_id
     *
     * @return the value of ds0..t_order.order_id
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    public TOrderDO withOrderId(Integer orderId) {
        this.setOrderId(orderId);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..t_order.order_id
     *
     * @param orderId the value for ds0..t_order.order_id
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method returns the value of the database column ds0..t_order.user_id
     *
     * @return the value of ds0..t_order.user_id
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    public TOrderDO withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..t_order.user_id
     *
     * @param userId the value for ds0..t_order.user_id
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TOrderDO other = (TOrderDO) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}