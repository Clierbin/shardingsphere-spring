package com.gupaovip.shardingsphere.shardingsphereprop.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class TConfigDO implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    private Integer configId;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    private String paraName;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    private String paraValue;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    private String paraDesc;

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column ds0..t_config.config_id
     *
     * @return the value of ds0..t_config.config_id
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public Integer getConfigId() {
        return configId;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public TConfigDO withConfigId(Integer configId) {
        this.setConfigId(configId);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..t_config.config_id
     *
     * @param configId the value for ds0..t_config.config_id
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    /**
     * This method returns the value of the database column ds0..t_config.para_name
     *
     * @return the value of ds0..t_config.para_name
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public String getParaName() {
        return paraName;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public TConfigDO withParaName(String paraName) {
        this.setParaName(paraName);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..t_config.para_name
     *
     * @param paraName the value for ds0..t_config.para_name
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public void setParaName(String paraName) {
        this.paraName = paraName;
    }

    /**
     * This method returns the value of the database column ds0..t_config.para_value
     *
     * @return the value of ds0..t_config.para_value
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public String getParaValue() {
        return paraValue;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public TConfigDO withParaValue(String paraValue) {
        this.setParaValue(paraValue);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..t_config.para_value
     *
     * @param paraValue the value for ds0..t_config.para_value
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    /**
     * This method returns the value of the database column ds0..t_config.para_desc
     *
     * @return the value of ds0..t_config.para_desc
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public String getParaDesc() {
        return paraDesc;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public TConfigDO withParaDesc(String paraDesc) {
        this.setParaDesc(paraDesc);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..t_config.para_desc
     *
     * @param paraDesc the value for ds0..t_config.para_desc
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    public void setParaDesc(String paraDesc) {
        this.paraDesc = paraDesc;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configId=").append(configId);
        sb.append(", paraName=").append(paraName);
        sb.append(", paraValue=").append(paraValue);
        sb.append(", paraDesc=").append(paraDesc);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
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
        TConfigDO other = (TConfigDO) that;
        return (this.getConfigId() == null ? other.getConfigId() == null : this.getConfigId().equals(other.getConfigId()))
            && (this.getParaName() == null ? other.getParaName() == null : this.getParaName().equals(other.getParaName()))
            && (this.getParaValue() == null ? other.getParaValue() == null : this.getParaValue().equals(other.getParaValue()))
            && (this.getParaDesc() == null ? other.getParaDesc() == null : this.getParaDesc().equals(other.getParaDesc()));
    }

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConfigId() == null) ? 0 : getConfigId().hashCode());
        result = prime * result + ((getParaName() == null) ? 0 : getParaName().hashCode());
        result = prime * result + ((getParaValue() == null) ? 0 : getParaValue().hashCode());
        result = prime * result + ((getParaDesc() == null) ? 0 : getParaDesc().hashCode());
        return result;
    }
}