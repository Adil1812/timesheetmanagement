package com.timesheetmanagement.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectAssignmentDTO {

    private Long id;
    private Long contractorId;
    private String projectCode;
    private Long managerId;
    private LocalDate assignedDate;
}
