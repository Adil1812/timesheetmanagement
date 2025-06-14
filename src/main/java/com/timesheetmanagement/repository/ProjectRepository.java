package com.timesheetmanagement.repository;

import com.timesheetmanagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {
    // projectCode is the primary key (VARCHAR)
}
