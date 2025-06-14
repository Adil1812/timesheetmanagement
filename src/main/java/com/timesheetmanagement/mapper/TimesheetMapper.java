//package com.timesheetmanagement.mapper;
//
//import com.timesheetmanagement.entity.Timesheet;
//import com.timesheetmanagement.payload.TimesheetDTO;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//@Mapper(componentModel = "spring")
//public interface TimesheetMapper {
//    @Mapping(source = "contractor.id", target = "contractorId")
//    @Mapping(source = "approvalStatus", target = "approvalStatus")
//    TimesheetDTO toDto(Timesheet entity);
//
//    @Mapping(source = "contractorId", target = "contractor.id")
//    @Mapping(source = "approvalStatus", target = "approvalStatus")
//    Timesheet toEntity(TimesheetDTO dto);
//}
