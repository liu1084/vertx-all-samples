package com.jim.mybatis.service.mapper;

import com.jim.entity.common.model.entity.GUser;

public interface GUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GUser record);

    int insertSelective(GUser record);

    GUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GUser record);

    int updateByPrimaryKey(GUser record);
}