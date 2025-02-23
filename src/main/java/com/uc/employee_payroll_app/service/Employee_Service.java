package com.uc.employee_payroll_app.service;

import com.uc.employee_payroll_app.model.Employees;
import com.uc.employee_payroll_app.repository.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Employee_Service {

    @Autowired
    private Employee_Repository employeeRepository;

    // Get All Employees
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get Employee by ID
    public Optional<Employees> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Create Employee
    public Employees createEmployee(Employees employee) {
        return employeeRepository.save(employee);
    }

    // Update Employee
    public Employees updateEmployee(Long id, Employees employeeDetails) {
        Employees employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setSalary(employeeDetails.getSalary());
        return employeeRepository.save(employee);
    }

    // Delete Employee
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

