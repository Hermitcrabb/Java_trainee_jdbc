package com.jdbc.jdbcDemo;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String employeeName;
    private String employeeAddress;
    private String employeeDepartment;

    public Employee(){

    }

    public Employee(String employeeName, String employeeAddress, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeDepartment = employeeDepartment;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public void setEmployeeAddress(String employeeAddress) { this.employeeAddress = employeeAddress; }

    public void setEmployeeDepartment(String employeeDepartment) { this.employeeDepartment = employeeDepartment; }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                '}';
    }
}
