package com.uc.employee_payroll_app.controller;
import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;
import com.uc.employee_payroll_app.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getEmployeePayrollData(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDTO employee) {
        return new ResponseEntity<>(employeeService.createEmployeePayrollData(employee), HttpStatus.CREATED);
    }
}