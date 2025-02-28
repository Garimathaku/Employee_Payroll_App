package com.uc.employee_payroll_app.util;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setGender(employeeDTO.getGender());
        employee.setStartDate(employeeDTO.getStartDate());
        employee.setNote(employeeDTO.getNote());
        employee.setProfilePic(employeeDTO.getProfilePic());
        employee.setDepartments(employeeDTO.getDepartment());  // Check if it's a list or a string
        return employee;
    }

    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employee.getName());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setGender(employee.getGender());
        employeeDTO.setStartDate(employee.getStartDate());
        employeeDTO.setNote(employee.getNote());
        employeeDTO.setProfilePic(employee.getProfilePic());
        employeeDTO.setDepartment(employee.getDepartments());  // Ensure correct mapping
        return employeeDTO;
    }
}
