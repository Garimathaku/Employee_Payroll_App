package com.uc.employee_payroll_app.service;


import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.util.EmployeeMapper;
import com.uc.employee_payroll_app.model.Employee;
import com.uc.employee_payroll_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {  // Changed int to Long
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {  // Changed int to Long
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            Employee updatedEmployee = employeeMapper.toEntity(employeeDTO);
            updatedEmployee.setId(id);
            return employeeRepository.save(updatedEmployee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {  // Changed int to Long
        employeeRepository.deleteById(id);
    }
}
