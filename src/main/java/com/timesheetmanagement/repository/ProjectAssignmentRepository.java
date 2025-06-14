package com.timesheetmanagement.repository;

import com.timesheetmanagement.entity.ProjectAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssignment, Long> {

    List<ProjectAssignment> findByContractorId(Long contractorId);
    List<ProjectAssignment> findByManagerId(Long managerId);
}
