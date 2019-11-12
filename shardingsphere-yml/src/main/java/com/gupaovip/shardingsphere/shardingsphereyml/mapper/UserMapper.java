package com.gupaovip.shardingsphere.shardingsphereyml.mapper;

import com.gupaovip.shardingsphere.shardingsphereyml.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {


    /**
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    int insertSelective(User record);

    /**
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    int deleteByPrimaryKey(Long userId);


    /**
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    int updateByPrimaryKey(User record);

    /**
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    User selectByPrimaryKey(Long userId);

    /**
     * @mbg.generated Tue Nov 12 17:28:56 CST 2019
     */
    int insert(User record);


    void addOne(User user);

    User getOneById(long id);
}
