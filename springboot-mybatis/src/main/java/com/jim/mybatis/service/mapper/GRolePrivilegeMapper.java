package com.jim.mybatis.service.mapper;

import com.jim.entity.common.model.entity.GRolePrivilege;

public interface GRolePrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GRolePrivilege record);

    int insertSelective(GRolePrivilege record);

    GRolePrivilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GRolePrivilege record);

    int updateByPrimaryKey(GRolePrivilege record);
}