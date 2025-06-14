package com.timesheetmanagement.mapper;

import com.timesheetmanagement.entity.Activity;
import com.timesheetmanagement.payload.ActivityDTO;

@Mapper(componentModel = "spring")
public interface ActivityMapper {
    ActivityDTO toDto(Activity activity);
    Activity toEntity(ActivityDTO dto);
}
