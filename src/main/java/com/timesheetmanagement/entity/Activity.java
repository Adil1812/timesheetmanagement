package com.timesheetmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "activities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
        @Id
        @Column(name = "activity_code", length = 30)
        @Size(max = 30, message = "Activity code must be at most 30 characters")
        @NotBlank(message = "Activity code is required")
        private String activityCode;

        @Column(name = "activity_name", nullable = false, length = 50)
        @NotBlank(message = "Activity name is required")
        @Size(max = 50, message = "Activity name must be at most 50 characters")
        private String activityName;

        @Column(name = "description", length = 255)
        @Size(max = 255, message = "Description must be at most 255 characters")
        private String description;
    }
}
