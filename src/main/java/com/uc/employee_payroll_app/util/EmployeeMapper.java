package com.uc.employee_payroll_app.util;


import com.uc.employee_payroll_app.DTO.EmployeeDTO;
import com.uc.employee_payroll_app.model.EmployeeThree;

public class EmployeeMapper {

    public static EmployeeThree toEntity(EmployeeDTO dto) {
        EmployeeThree employee = new EmployeeThree();
        employee.setName(dto.getName());
        employee.setSalary(dto.getSalary());
        return employee;
    }

    public static EmployeeDTO toDTO(EmployeeThree employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(employee.getName());
        dto.setSalary(employee.getSalary());
        return dto;
    }
}

