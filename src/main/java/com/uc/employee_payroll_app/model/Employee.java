package com.uc.employee_payroll_app.model;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Changed from int to Long

    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    private List<String> departments;

    public Employee() {}

    public Employee(Long id, EmployeeDTO employeeDTO) { // Changed int to Long
        this.id = id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
        this.gender = employeeDTO.gender;
        this.note = employeeDTO.note;
        this.startDate = employeeDTO.startDate;
        this.profilePic = employeeDTO.profilePic;
        this.departments = employeeDTO.departments;
    }
}
