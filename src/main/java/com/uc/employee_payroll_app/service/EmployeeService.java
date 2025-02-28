package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;
import com.uc.employee_payroll_app.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeePayrollData() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeePayrollDataById(int empId) {
        return employeeRepository.findById(empId).orElse(null);
    }

    public Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        Employee empData = new Employee(empPayrollDTO);
        log.debug("Emp Data: " + empData.toString());
        return employeeRepository.save(empData);
    }

    public Employee updateEmployeePayrollData(int empId, EmployeeDTO empPayrollDTO) {
        Employee empData = getEmployeePayrollDataById(empId);
        if (empData != null) {
            empData.updateEmployeePayrollData(empPayrollDTO);
            return employeeRepository.save(empData);
        }
        return null;
    }

    public void deleteEmployeePayrollData(int empId) {
        employeeRepository.deleteById(empId);
    }
}