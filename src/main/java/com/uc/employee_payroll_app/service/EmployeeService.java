package com.uc.employee_payroll_app.service;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.exception_handler.GlobalExceptionHandler;
import com.uc.employee_payroll_app.model.Employee;
import com.uc.employee_payroll_app.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getEmployeePayrollData() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee getEmployeePayrollDataById(int empId) {
        return employeeRepository.findById(empId)
                .orElseThrow(() -> new GlobalExceptionHandler("Employee with employeeId " + empId + " does not exist..!!"));
    }


    @Override
    public Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        Employee empData = new Employee(empPayrollDTO);
        log.debug("Employee Data: " + empData.toString());
        return employeeRepository.save(empData);
    }


    @Override
    public Employee updateEmployeePayrollData(int empId, EmployeeDTO empPayrollDTO) {
        Employee empData = this.getEmployeePayrollDataById(empId);
        empData.updateEmployeePayrollData(empPayrollDTO);
        return employeeRepository.save(empData);
    }


    @Override
    public void deleteEmployeePayrollData(int empId) {
        Employee empData = this.getEmployeePayrollDataById(empId);
        employeeRepository.delete(empData);
    }
}
