package com.timesheetmanagement.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timesheet_id")
    private Long timesheetId;

    @Column(name = "week_start_date", nullable = false)
    private LocalDate weekStartDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractor_id", nullable = false)
    private Contractor contractor;

    @Enumerated(EnumType.STRING)
    @Column(name = "approval_status", length = 15)
    private ApprovalStatus approvalStatus;

    @Column(name = "manager_comment", length = 255)
    private String managerComment;

    public enum ApprovalStatus {
        APPROVED,
        REJECTED
    }
}
