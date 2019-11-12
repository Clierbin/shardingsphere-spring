package com.gupaovip.shardingsphere.shardingsphereprop.mapper;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TConfigDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TConfigMapper {
    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    int deleteByPrimaryKey(Integer configId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    int insert(TConfigDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    int insertSelective(TConfigDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    TConfigDO selectByPrimaryKey(Integer configId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    int updateByPrimaryKeySelective(TConfigDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:10 CST 2019
     */
    int updateByPrimaryKey(TConfigDO record);
}