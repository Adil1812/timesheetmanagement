package com.timesheetmanagement.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "contractors")


public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contractor_id")
    private Long contractorId;


    @Column(nullable = false, length = 50, unique = true)
    private String username;


    @Column(nullable = false, length = 250)
    private String password;
    public Long getContractorId() {
        return contractorId;
    }

    public void setContractorId(Long contractorId) {
        this.contractorId = contractorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
