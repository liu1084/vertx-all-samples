package com.jim.mybatis.service.mapper;

import com.jim.entity.common.model.entity.GPrivilege;

public interface GPrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GPrivilege record);

    int insertSelective(GPrivilege record);

    GPrivilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GPrivilege record);

    int updateByPrimaryKey(GPrivilege record);
}