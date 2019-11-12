package com.gupaovip.shardingsphere.shardingsphereprop.mapper;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TOrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TOrderMapper {
    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    int insert(TOrderDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    int insertSelective(TOrderDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    TOrderDO selectByPrimaryKey(Integer orderId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    int updateByPrimaryKeySelective(TOrderDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:05 CST 2019
     */
    int updateByPrimaryKey(TOrderDO record);

}