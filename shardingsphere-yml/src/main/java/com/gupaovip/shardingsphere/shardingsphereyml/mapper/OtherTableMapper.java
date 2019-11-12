package com.gupaovip.shardingsphere.shardingsphereyml.mapper;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.OtherTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OtherTableMapper {

    /**
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    OtherTable selectByPrimaryKey(Long id);

    /**
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    int updateByPrimaryKey(OtherTable record);

    /**
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    int insertSelective(OtherTable record);

    /**
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    int insert(OtherTable record);

    /**
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated Tue Nov 12 17:35:23 CST 2019
     */
    int updateByPrimaryKeySelective(OtherTable record);

    long addOne(OtherTable table);

    List<OtherTable> getAll();

}
