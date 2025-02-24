package com.uc.employee_payroll_app.service;



import com.uc.employee_payroll_app.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeServiceFour {
    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> getAllEmployees();
}

