package com.timesheetmanagement.entity;

import com.example.timesheetmanagement.enums.ProjectStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
