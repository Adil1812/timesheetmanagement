package com.timesheetmanagement.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDTO {

    private Long id;

    @NotBlank(message = "Role actor is required")
    @Size(max = 30, message = "Role name must be at most 30 characters")
    private String actor;
}
