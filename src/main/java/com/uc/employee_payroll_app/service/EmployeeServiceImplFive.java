package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.DTO.EmployeeDTO;
import com.uc.employee_payroll_app.model.EmployeeFour;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplFive implements EmployeeServiceFive {

    private final List<EmployeeFour> employeeList = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1); // Generates unique IDs

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        EmployeeFour employee = new EmployeeFour();
        employee.setId(idCounter.getAndIncrement()); // Assign unique ID
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());

        employeeList.add(employee);
        return convertToDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeList.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Optional<EmployeeFour> employee = employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst();
        return employee.map(this::convertToDTO).orElse(null);
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Optional<EmployeeFour> employeeOptional = employeeList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst();

        if (employeeOptional.isPresent()) {
            EmployeeFour employee = employeeOptional.get();
            employee.setName(employeeDTO.getName());
            employee.setSalary(employeeDTO.getSalary());
            return convertToDTO(employee);
        }
        return null; // Return null if employee not found
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeList.removeIf(emp -> emp.getId().equals(id));
    }

    private EmployeeDTO convertToDTO(EmployeeFour employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(employee.getName());
        dto.setSalary(employee.getSalary());
        return dto;
    }
}

