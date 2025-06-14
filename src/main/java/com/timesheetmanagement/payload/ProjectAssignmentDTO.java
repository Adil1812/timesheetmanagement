package com.timesheetmanagement.payload;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectAssignmentDTO {

    private Long id;
    private Long contractorId;
    private String projectCode;
    private Long managerId;
    private LocalDate assignedDate;
}
