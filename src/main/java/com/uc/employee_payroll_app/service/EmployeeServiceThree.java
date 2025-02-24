package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.DTO.EmployeeDTO;
import com.uc.employee_payroll_app.util.EmployeeMapper;
import com.uc.employee_payroll_app.model.EmployeeThree;
import com.uc.employee_payroll_app.repository.EmployeeRepositoryThree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceThree {

    @Autowired
    private EmployeeRepositoryThree repository;

    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        EmployeeThree employee = EmployeeMapper.toEntity(employeeDTO);
        EmployeeThree savedEmployee = repository.save(employee);
        return EmployeeMapper.toDTO(savedEmployee);
    }

    public List<EmployeeDTO> getAllEmployees() {
        return repository.findAll()
                .stream()
                .map(EmployeeMapper::toDTO)
                .collect(Collectors.toList());
    }
}

