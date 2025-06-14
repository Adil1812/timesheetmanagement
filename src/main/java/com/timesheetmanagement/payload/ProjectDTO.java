package com.timesheetmanagement.payload;

import com.timesheetmanagement.payload.ProjectDTO;
import com.timesheetmanagement.util.ProjectStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO {

    @NotBlank(message = "Project code is required")
    @Size(max = 30, message = "Project code must be at most 30 characters")
    private String projectCode;

    @NotBlank(message = "Project name is required")
    @Size(max = 50, message = "Project name must be at most 50 characters")
    private String name;

    @NotBlank(message = "Client name is required")
    @Size(max = 50, message = "Client name must be at most 50 characters")
    private String client;

    private ProjectStatus status;
}
