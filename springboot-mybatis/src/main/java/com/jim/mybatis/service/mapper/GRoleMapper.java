package com.jim.mybatis.service.mapper;

import com.jim.entity.common.model.entity.GRole;

public interface GRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GRole record);

    int insertSelective(GRole record);

    GRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GRole record);

    int updateByPrimaryKey(GRole record);
}