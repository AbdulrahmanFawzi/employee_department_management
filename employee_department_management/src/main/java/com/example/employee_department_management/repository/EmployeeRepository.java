package com.example.employee_department_management.repository;

import com.example.employee_department_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
															
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {}
