package com.timesheetmanagement.repository;


import com.timesheetmanagement.entity.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {
    // Add custom queries if needed
}