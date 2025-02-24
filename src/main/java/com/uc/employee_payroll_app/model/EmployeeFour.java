package com.uc.employee_payroll_app.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees_payroll")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeFour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;
}

