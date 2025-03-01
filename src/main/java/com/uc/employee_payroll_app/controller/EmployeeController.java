package com.uc.employee_payroll_app.controller;



import com.uc.employee_payroll_app.model.Employee;
import com.uc.employee_payroll_app.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeePayrollService;

    @GetMapping("/employees") //  Add this endpoint
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeePayrollService.getEmployeePayrollData());
    }


    @GetMapping("/department/{department}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String department) {
        return ResponseEntity.ok(employeePayrollService.getEmployeesByDepartment(department));
    }
}