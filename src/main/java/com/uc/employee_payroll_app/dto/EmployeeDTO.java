package com.uc.employee_payroll_app.dto;


import lombok.Data;
import java.util.List;

@Data
public class EmployeeDTO {
    private String name;
    private String gender;
    private double salary;
    private List<String> department;
}