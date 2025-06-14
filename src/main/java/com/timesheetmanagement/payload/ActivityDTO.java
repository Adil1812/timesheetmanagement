package com.timesheetmanagement.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActivityDTO {



        @NotBlank(message = "Activity code is required")
        @Size(max = 30, message = "Activity code must be at most 30 characters")
        private String activityCode;

        @NotBlank(message = "Activity name is required")
        @Size(max = 50, message = "Activity name must be at most 50 characters")
        private String activityName;

        @Size(max = 255, message = "Description must be at most 255 characters")
        private String description;
    }

