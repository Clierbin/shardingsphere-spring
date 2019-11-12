package com.gupaovip.shardingsphere.shardingsphereyml.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Dictionary implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    private Long dictionaryId;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    private String value;

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column ds0..dictionary.dictionary_id
     *
     * @return the value of ds0..dictionary.dictionary_id
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public Long getDictionaryId() {
        return dictionaryId;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public Dictionary withDictionaryId(Long dictionaryId) {
        this.setDictionaryId(dictionaryId);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..dictionary.dictionary_id
     *
     * @param dictionaryId the value for ds0..dictionary.dictionary_id
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public void setDictionaryId(Long dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    /**
     * This method returns the value of the database column ds0..dictionary.name
     *
     * @return the value of ds0..dictionary.name
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public Dictionary withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..dictionary.name
     *
     * @param name the value for ds0..dictionary.name
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column ds0..dictionary.value
     *
     * @return the value of ds0..dictionary.value
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public Dictionary withValue(String value) {
        this.setValue(value);
        return this;
    }

    /**
     * This method sets the value of the database column ds0..dictionary.value
     *
     * @param value the value for ds0..dictionary.value
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dictionaryId=").append(dictionaryId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
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
        Dictionary other = (Dictionary) that;
        return (this.getDictionaryId() == null ? other.getDictionaryId() == null : this.getDictionaryId().equals(other.getDictionaryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDictionaryId() == null) ? 0 : getDictionaryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }
}