package com.gupaovip.shardingsphere.shardingsphereprop.mapper;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.TOrderItemDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TOrderItemMapper {
    /**
     *
     * @mbg.generated Tue Nov 12 15:15:07 CST 2019
     */
    int deleteByPrimaryKey(Integer itemId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:07 CST 2019
     */
    int insert(TOrderItemDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:07 CST 2019
     */
    int insertSelective(TOrderItemDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:07 CST 2019
     */
    TOrderItemDO selectByPrimaryKey(Integer itemId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:07 CST 2019
     */
    int updateByPrimaryKeySelective(TOrderItemDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:07 CST 2019
     */
    int updateByPrimaryKey(TOrderItemDO record);

    List<TOrderItemDO> selectOrderAndItem();
}