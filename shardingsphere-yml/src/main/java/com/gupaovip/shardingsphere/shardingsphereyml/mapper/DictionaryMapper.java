package com.gupaovip.shardingsphere.shardingsphereyml.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.gupaovip.shardingsphere.shardingsphereyml.entity.Dictionary;

@Mapper
public interface DictionaryMapper {

    /**
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    int insert(Dictionary record);

    /**
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    Dictionary selectByPrimaryKey(Long dictionaryId);

    /**
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    int deleteByPrimaryKey(Long dictionaryId);

    /**
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    int updateByPrimaryKeySelective(Dictionary record);

    long addOne(Dictionary dictionary);

    /**
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    int updateByPrimaryKey(Dictionary record);

    /**
     * @mbg.generated Tue Nov 12 17:27:18 CST 2019
     */
    int insertSelective(Dictionary record);
}
