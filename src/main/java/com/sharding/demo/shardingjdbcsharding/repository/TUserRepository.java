package com.sharding.demo.shardingjdbcsharding.repository;

import com.sharding.demo.shardingjdbcsharding.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TUserRepository {
    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectAll(TUser record);
}