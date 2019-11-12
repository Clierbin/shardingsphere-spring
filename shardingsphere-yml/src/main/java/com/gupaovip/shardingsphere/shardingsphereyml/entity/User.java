package com.gupaovip.shardingsphere.shardingsphereyml.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class User implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    private Long userId;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    private Integer age;

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column ds0..user.user_id
     *
     * @return the value of ds0..user.user_id
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public User withUserId(Long userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..user.user_id
     *
     * @param userId the value for ds0..user.user_id
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column ds0..user.name
     *
     * @return the value of ds0..user.name
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public User withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..user.name
     *
     * @param name the value for ds0..user.name
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column ds0..user.age
     *
     * @return the value of ds0..user.age
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public User withAge(Integer age) {
        this.setAge(age);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..user.age
     *
     * @param age the value for ds0..user.age
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()));
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        return result;
    }
}