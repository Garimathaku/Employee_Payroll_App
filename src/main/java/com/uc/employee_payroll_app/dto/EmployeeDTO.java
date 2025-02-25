package com.uc.employee_payroll_app.dto;



import lombok.*;

@Getter  // Generates getters for all fields
@Setter  // Generates setters for all fields
@NoArgsConstructor  // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all fields
public class EmployeeDTO {
    private String name;
    private double salary;
}
