package com.timesheetmanagement.mapper;

import com.timesheetmanagement.entity.Contractor;
import com.timesheetmanagement.payload.ContractorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractorMapper {
    ContractorDTO toDto(Contractor contractor);
    Contractor toEntity(ContractorDTO dto);
}
