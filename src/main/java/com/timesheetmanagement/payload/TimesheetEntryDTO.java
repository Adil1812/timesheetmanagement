package com.timesheetmanagement.payload;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TimesheetEntryDTO {
    private Long entryId;

    @NotNull(message = "Contractor ID is required")
    private Long contractorId;

    @NotBlank(message = "Project code is required")
    private String projectCode;

    @NotBlank(message = "Activity code is required")
    private String activityCode;

    @NotNull(message = "Date is required")
    private LocalDate date;

    @NotNull(message = "Hours worked is required")
    @DecimalMin(value = "0.0", message = "Hours must be at least 0")
    @DecimalMax(value = "24.0", message = "Hours must not exceed 24")
    private Double hoursWorked;

    private String comments;

    private String status; // Optional: DRAFT, SUBMITTED, etc.
}
