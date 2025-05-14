package com.example.employee_department_management.controller;

import com.example.employee_department_management.model.Department;
import com.example.employee_department_management.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addDepartment(@RequestBody Department department) {
        departmentRepository.save(department);
        return ResponseEntity.ok("Department added successfully!");
    }
}
