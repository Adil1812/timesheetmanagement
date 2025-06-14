package com.timesheetmanagement.repository;

import com.timesheetmanagement.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, String> {
        }
