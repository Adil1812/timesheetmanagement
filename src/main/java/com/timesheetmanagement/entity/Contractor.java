package com.timesheetmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "contractors")
@AllArgsConstructor
@NoArgsConstructor
@Data

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
