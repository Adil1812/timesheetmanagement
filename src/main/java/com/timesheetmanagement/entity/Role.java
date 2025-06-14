package com.timesheetmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Role actor is required")
    @Size(max = 30, message = "Role name must be at most 30 characters")
    @Column(name = "actor", nullable = false, unique = true, length = 30)
    private String actor; // Example: ADMIN, PROJECT_MANAGER, CONTRACTOR


}
