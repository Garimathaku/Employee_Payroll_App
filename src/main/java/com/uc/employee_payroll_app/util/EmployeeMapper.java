package com.uc.employee_payroll_app.util;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import com.uc.employee_payroll_app.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.name);
        employee.setSalary(employeeDTO.salary);
        employee.setGender(employeeDTO.gender);
        employee.setStartDate(employeeDTO.startDate);
        employee.setNote(employeeDTO.note);
        employee.setProfilePic(employeeDTO.profilePic);
        employee.setDepartments(employeeDTO.departments);
        return employee;
    }

    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.name = employee.getName();
        employeeDTO.salary = employee.getSalary();
        employeeDTO.gender = employee.getGender();
        employeeDTO.startDate = employee.getStartDate();
        employeeDTO.note = employee.getNote();
        employeeDTO.profilePic = employee.getProfilePic();
        employeeDTO.departments = employee.getDepartments();
        return employeeDTO;
    }
}
