package com.timesheetmanagement.mapper;

import com.timesheetmanagement.entity.Timesheet;
import com.timesheetmanagement.payload.TimesheetDTO;
import org.springframework.web.bind.annotation.Mapping;
@Mapper(componentModel = "spring")
public interface TimesheetMapper {
    @Mapping(source = "contractor.id", target = "contractorId")
    @Mapping(source = "approvalStatus", target = "approvalStatus")
    TimesheetDTO toDto(Timesheet entity);

    @Mapping(source = "contractorId", target = "contractor.id")
    @Mapping(source = "approvalStatus", target = "approvalStatus")
    Timesheet toEntity(TimesheetDTO dto);
}
