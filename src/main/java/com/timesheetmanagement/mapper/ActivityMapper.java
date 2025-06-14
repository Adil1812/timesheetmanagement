package com.timesheetmanagement.mapper;

import com.timesheetmanagement.entity.Activity;
import com.timesheetmanagement.payload.ActivityDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityMapper {
    ActivityDTO toDto(Activity activity);
    Activity toEntity(ActivityDTO dto);
}
