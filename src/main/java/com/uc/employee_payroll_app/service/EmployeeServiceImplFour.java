package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.DTO.EmployeeDTO;
import com.uc.employee_payroll_app.model.EmployeeFour;
import com.uc.employee_payroll_app.repository.EmployeeRepositoryFour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplFour implements EmployeeServiceFour {

    @Autowired
    private EmployeeRepositoryFour repository;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        EmployeeFour employee = new EmployeeFour();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());

        EmployeeFour savedEmployee = repository.save(employee);
        return convertToDTO(savedEmployee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return repository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private EmployeeDTO convertToDTO(EmployeeFour employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(employee.getName());
        dto.setSalary(employee.getSalary());
        return dto;
    }
}

