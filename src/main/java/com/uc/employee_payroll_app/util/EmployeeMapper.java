package com.uc.employee_payroll_app.util;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;


public class EmployeeMapper {

    // Convert Entity → DTO
    public static EmployeeDTO toDTO(Employee employee) {
        return new EmployeeDTO(employee.getName(), employee.getSalary());
    }

    // Convert DTO → Entity
    public static Employee toEntity(EmployeeDTO dto) {
        return new Employee(null, dto.getName(), dto.getSalary());
    }
}

