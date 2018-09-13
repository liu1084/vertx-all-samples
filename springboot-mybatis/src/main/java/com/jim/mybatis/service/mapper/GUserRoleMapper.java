package com.jim.mybatis.service.mapper;

import com.jim.entity.common.model.entity.GUserRole;

public interface GUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GUserRole record);

    int insertSelective(GUserRole record);

    GUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GUserRole record);

    int updateByPrimaryKey(GUserRole record);
}