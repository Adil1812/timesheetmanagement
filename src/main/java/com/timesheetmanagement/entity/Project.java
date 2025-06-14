package com.timesheetmanagement.entity;


import com.timesheetmanagement.util.ProjectStatus;
import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
@Data
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
