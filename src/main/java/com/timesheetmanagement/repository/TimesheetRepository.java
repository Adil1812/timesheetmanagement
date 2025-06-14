package com.timesheetmanagement.repository;

import com.timesheetmanagement.entity.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

    List<Timesheet> findByContractorId(Long contractorId);
    List<Timesheet> findByApprovalStatus(Timesheet.ApprovalStatus status);
}
