package com.timesheetmanagement.mapper;

import com.timesheetmanagement.entity.TimesheetEntry;
import com.timesheetmanagement.payload.TimesheetEntryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface TimesheetEntryMapper {

    @Mapping(source = "contractor.id", target = "contractorId")
    @Mapping(source = "project.projectCode", target = "projectCode")
    @Mapping(source = "activity.activityCode", target = "activityCode")
    @Mapping(source = "status", target = "status")
    TimesheetEntryDTO toDto(TimesheetEntry entity);

    @Mapping(source = "contractorId", target = "contractor.id")
    @Mapping(source = "projectCode", target = "project.projectCode")
    @Mapping(source = "activityCode", target = "activity.activityCode")
    @Mapping(source = "status", target = "status")
    TimesheetEntry toEntity(TimesheetEntryDTO dto);
}
