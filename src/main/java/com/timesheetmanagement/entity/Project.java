package com.timesheetmanagement.entity;

import com.timesheetmanagement.entity.Project;
import com.timesheetmanagement.util.ProjectStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "projects")

public class Project {

    @Id
    @Column(name = "project_code", length = 30)

    private String projectCode;

    @Column(name = "name", nullable = false, length = 50)

    private String name;

    @Column(name = "client", nullable = false, length = 50)

    private String client;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 10)
    private ProjectStatus status;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }
}
