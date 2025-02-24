package com.uc.employee_payroll_app.controller;



import com.uc.employee_payroll_app.DTO.EmployeeDTO;
import com.uc.employee_payroll_app.service.EmployeeServiceThree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees_three")
public class EmployeeControllerThree {

    @Autowired
    private EmployeeServiceThree service;

    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return service.addEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return service.getAllEmployees();
    }
}

