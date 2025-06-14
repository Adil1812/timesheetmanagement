package com.timesheetmanagement.mapper;

import com.timesheetmanagement.entity.ProjectAssignment;
import com.timesheetmanagement.payload.ProjectAssignmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ProjectAssignmentMapper {
    @Mapping(source = "contractor.id", target = "contractorId")
    @Mapping(source = "project.projectCode", target = "projectCode")
    @Mapping(source = "manager.id", target = "managerId")
    ProjectAssignmentDTO toDto(ProjectAssignment entity);

    @Mapping(source = "contractorId", target = "contractor.id")
    @Mapping(source = "projectCode", target = "project.projectCode")
    @Mapping(source = "managerId", target = "manager.id")
    ProjectAssignment toEntity(ProjectAssignmentDTO dto);
}
