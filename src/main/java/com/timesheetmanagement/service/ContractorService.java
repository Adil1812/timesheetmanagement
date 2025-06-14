package com.timesheetmanagement.service;


import com.timesheetmanagement.payload.ContractorDTO;

public interface ContractorService {
    ContractorDTO registerContractor(ContractorDTO dto);
}