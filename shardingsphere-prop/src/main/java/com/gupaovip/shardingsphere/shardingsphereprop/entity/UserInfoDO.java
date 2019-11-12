package com.gupaovip.shardingsphere.shardingsphereprop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 *
 * @author
 */
public class UserInfoDO implements Serializable {

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    private String account;

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    private String password;

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    private Long userId;

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    private String userName;

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public UserInfoDO withAccount(String account) {
        this.setAccount(account);
        return this;
    }

    /**
     * This method returns the value of the database column ds0..user_info.user_name
     *
     * @return the value of ds0..user_info.user_name
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
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
        UserInfoDO other = (UserInfoDO) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId())) && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName())) && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount())) && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    /**
     * This method returns the value of the database column ds0..user_info.password
     *
     * @return the value of ds0..user_info.password
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public UserInfoDO withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public UserInfoDO withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method returns the value of the database column ds0..user_info.account
     *
     * @return the value of ds0..user_info.account
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method sets the value of the database column ds0..user_info.user_name
     *
     * @param userName the value for ds0..user_info.user_name
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method sets the value of the database column ds0..user_info.user_id
     *
     * @param userId the value for ds0..user_info.user_id
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method sets the value of the database column ds0..user_info.password
     *
     * @param password the value for ds0..user_info.password
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public UserInfoDO withUserId(Long userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..user_info.account
     *
     * @param account the value for ds0..user_info.account
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method returns the value of the database column ds0..user_info.user_id
     *
     * @return the value of ds0..user_info.user_id
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    public Long getUserId() {
        return userId;
    }
}
