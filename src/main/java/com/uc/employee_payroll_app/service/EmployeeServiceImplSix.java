package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.DTO.EmployeeDTO;
import com.uc.employee_payroll_app.model.EmployeeFour;
import com.uc.employee_payroll_app.repository.EmployeeRepositoryFour;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j  // Enables logging
@Service
@Primary
public class EmployeeServiceImplSix implements EmployeeServiceFour {

    @Autowired
    private EmployeeRepositoryFour repository;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        log.info("Adding a new employee: {}", employeeDTO.getName());

        EmployeeFour employee = new EmployeeFour();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());

        EmployeeFour savedEmployee = repository.save(employee);

        log.debug("Saved Employee ID: {}", savedEmployee.getId());
        return convertToDTO(savedEmployee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        log.info("Fetching all employees...");
        List<EmployeeDTO> employees = repository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
        log.debug("Total employees retrieved: {}", employees.size());
        return employees;
    }

    private EmployeeDTO convertToDTO(EmployeeFour employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(employee.getName());
        dto.setSalary(employee.getSalary());
        return dto;
    }
}
