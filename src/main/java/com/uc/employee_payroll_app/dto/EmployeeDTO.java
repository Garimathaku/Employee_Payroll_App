package com.uc.employee_payroll_app.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private double salary;
}
