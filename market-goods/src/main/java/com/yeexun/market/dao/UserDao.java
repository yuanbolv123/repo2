package com.yeexun.market.dao;

import com.yeexun.market.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User SelectUserByRealName(String realName);

    User SelectByPhone(String phone);
}