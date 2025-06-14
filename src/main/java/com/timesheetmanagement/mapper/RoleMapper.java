package com.timesheetmanagement.mapper;


import com.timesheetmanagement.entity.Role;
import com.timesheetmanagement.payload.RoleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDTO toDto(Role role);
    Role toEntity(RoleDTO dto);
}
