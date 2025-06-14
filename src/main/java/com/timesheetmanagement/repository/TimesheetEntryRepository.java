package com.timesheetmanagement.repository;

import ch.qos.logback.core.status.Status;
import com.timesheetmanagement.entity.TimesheetEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TimesheetEntryRepository extends JpaRepository<TimesheetEntry, Long> {

    List<TimesheetEntry> findByContractorId(Long contractorId);
    List<TimesheetEntry> findByStatus(Status status);
    List<TimesheetEntry> findByDateBetween(LocalDate startDate, LocalDate endDate);
}
