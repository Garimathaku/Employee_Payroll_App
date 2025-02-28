package com.uc.employee_payroll_app.model;



import com.uc.employee_payroll_app.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee2")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int employeeId;

    @Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "department2", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> departments;

    public Employee(EmployeeDTO empPayrollDTO) {
        this.updateEmployeePayrollData(empPayrollDTO);
    }

    public void updateEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        this.name = empPayrollDTO.getName();
        this.salary = empPayrollDTO.getSalary();
        this.gender = empPayrollDTO.getGender();
        this.startDate = empPayrollDTO.getStartDate();
        this.note = empPayrollDTO.getNote();
        this.profilePic = empPayrollDTO.getProfilePic();
        this.departments = empPayrollDTO.getDepartment();
    }
}
