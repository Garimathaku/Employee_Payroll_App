package com.uc.employee_payroll_app.service;



import com.uc.employee_payroll_app.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeServiceFive {
    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeById(Long id);
    EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}

