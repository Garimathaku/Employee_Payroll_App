package com.uc.employee_payroll_app.service;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;
import com.uc.employee_payroll_app.repository.EmployeeRepository;
import com.uc.employee_payroll_app.util.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeePayrollData() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeePayrollDataById(int empId) {
        return employeeRepository.findById(empId).orElse(null);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findEmployeesByDepartment(department);
    }

    @Override
    public Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        Employee employee = EmployeeMapper.mapToEntity(empPayrollDTO);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeePayrollData(int empId, EmployeeDTO empPayrollDTO) {
        Employee employee = getEmployeePayrollDataById(empId);
        if (employee != null) {
            employee.setName(empPayrollDTO.getName());
            employee.setGender(empPayrollDTO.getGender());
            employee.setSalary(empPayrollDTO.getSalary());
            employee.setDepartment(empPayrollDTO.getDepartment());
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeeRepository.deleteById(empId);
    }
}