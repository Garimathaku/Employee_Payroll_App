package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>(); // Temporary Storage
    private final AtomicLong idCounter = new AtomicLong(1); // Generates unique IDs

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(Long id) {
        return employees.stream().filter(emp -> emp.getId().equals(id)).findFirst();
    }

    // Add new employee
    public Employee addEmployee(Employee employee) {
        employee.setId(idCounter.getAndIncrement()); // Auto-increment ID
        employees.add(employee);
        return employee;
    }

    // Update employee
    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Optional<Employee> existingEmployee = getEmployeeById(id);
        if (existingEmployee.isPresent()) {
            Employee employee = existingEmployee.get();
            employee.setName(employeeDetails.getName());
            employee.setSalary(employeeDetails.getSalary());
            return employee;
        } else {
            throw new RuntimeException("Employee Not Found");
        }
    }

    // Delete employee
    public void deleteEmployee(Long id) {
        employees.removeIf(emp -> emp.getId().equals(id));
    }
}
