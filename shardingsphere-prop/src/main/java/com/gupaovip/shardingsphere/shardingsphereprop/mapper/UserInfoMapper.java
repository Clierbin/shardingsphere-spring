package com.gupaovip.shardingsphere.shardingsphereprop.mapper;

import com.gupaovip.shardingsphere.shardingsphereprop.entity.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    /**
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    int insert(UserInfoDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    int insertSelective(UserInfoDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    UserInfoDO selectByPrimaryKey(Long userId);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    int updateByPrimaryKeySelective(UserInfoDO record);

    /**
     *
     * @mbg.generated Tue Nov 12 15:15:02 CST 2019
     */
    int updateByPrimaryKey(UserInfoDO record);

    UserInfoDO getUserInfoByUserId(long l);
}