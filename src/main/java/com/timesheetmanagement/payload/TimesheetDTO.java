package com.timesheetmanagement.payload;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TimesheetDTO {
    private Long timesheetId;

    @NotNull(message = "Week start date is required")
    private LocalDate weekStartDate;

    @NotNull(message = "Contractor ID is required")
    private Long contractorId;

    private String approvalStatus; // Optional: "APPROVED" or "REJECTED"

    private String managerComment; // Optional: mandatory if status is REJECTED
}
