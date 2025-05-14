package com.example.employee_department_management.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @Column(nullable = false)
    private String employeeName;
    private Double employeeSalary;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "departmentId")
    @JsonManagedReference
    private Department department;
    public Employee() {}
    public Employee(String employeeName, Double employeeSalary, Department department) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.department = department;
    }
    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Double getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
