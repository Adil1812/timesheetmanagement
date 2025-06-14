package com.timesheetmanagement.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "contractors")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contractor_id")
    private Long contractorId;


    @Column(nullable = false, length = 50, unique = true)
    private String username;


    @Column(nullable = false, length = 250)
    private String password;
}
