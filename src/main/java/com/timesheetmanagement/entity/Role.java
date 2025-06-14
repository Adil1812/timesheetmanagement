package com.timesheetmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "roles")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Role actor is required")
    @Size(max = 30, message = "Role name must be at most 30 characters")
    @Column(name = "actor", nullable = false, unique = true, length = 30)
    private String actor; // Example: ADMIN, PROJECT_MANAGER, CONTRACTOR

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
