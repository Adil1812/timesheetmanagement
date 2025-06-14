package com.timesheetmanagement.mapper;


import com.timesheetmanagement.entity.Project;
import com.timesheetmanagement.payload.ProjectDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectDTO toDto(Project project);
    Project toEntity(ProjectDTO dto);
}
