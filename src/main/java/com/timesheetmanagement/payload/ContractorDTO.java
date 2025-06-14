package com.timesheetmanagement.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContractorDTO {

    private Long contractorId;

    @NotBlank(message = "Username is required")
    @Size(max = 50, message = "Username must be at most 50 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(max = 250, message = "Password must be at most 250 characters")
    private String password;
}
