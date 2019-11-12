package com.gupaovip.shardingsphere.shardingsphereyml.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class OtherTable implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    private Long id;

    /**
     *
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    private String name;

    /**
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column ds2..other_table.id
     *
     * @return the value of ds2..other_table.id
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    public OtherTable withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column ds2..other_table.id
     *
     * @param id the value for ds2..other_table.id
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column ds2..other_table.name
     *
     * @return the value of ds2..other_table.name
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    public OtherTable withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column ds2..other_table.name
     *
     * @param name the value for ds2..other_table.name
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
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
        OtherTable other = (OtherTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     *
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}