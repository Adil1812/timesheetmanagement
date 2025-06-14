package com.timesheetmanagement.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "timesheet_entry")

public class TimesheetEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entry_id")
    private Long entryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractor_id", nullable = false)
    private Contractor contractor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_code", referencedColumnName = "project_code", nullable = false)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_code", referencedColumnName = "activity_code", nullable = false)
    private Activity activity;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "hours_worked", nullable = false)
    private Double hoursWorked;

    @Column(name = "comments", length = 255)
    private String comments;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 15)
    private Status status;

    public enum Status {
        DRAFT,
        SUBMITTED,
        APPROVED,
        REJECTED
    }
}
