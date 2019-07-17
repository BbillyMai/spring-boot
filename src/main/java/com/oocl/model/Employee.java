package com.oocl.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "record_id")
    private EmployeeRecord employeeRecord;


    public EmployeeRecord getEmployeeRecord() {
        return employeeRecord;
    }

    public void setEmployeeRecord(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
