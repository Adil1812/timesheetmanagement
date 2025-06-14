package com.timesheetmanagement.mapper;


import com.timesheetmanagement.entity.Project;
import com.timesheetmanagement.payload.ProjectDTO;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectDTO toDto(Project project);
    Project toEntity(ProjectDTO dto);
}
