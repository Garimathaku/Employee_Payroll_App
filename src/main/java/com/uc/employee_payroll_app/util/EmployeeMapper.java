package com.uc.employee_payroll_app.util;


import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;

public class EmployeeMapper {
    public static Employee mapToEntity(EmployeeDTO dto) {
        return new Employee(0, dto.getName(), dto.getGender(), dto.getSalary(), dto.getDepartment());
    }
}