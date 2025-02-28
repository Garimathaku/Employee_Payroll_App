package com.uc.employee_payroll_app.service;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployeePayrollData();
    Employee getEmployeePayrollDataById(int empId);
    Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO);
    Employee updateEmployeePayrollData(int empId, EmployeeDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
}

