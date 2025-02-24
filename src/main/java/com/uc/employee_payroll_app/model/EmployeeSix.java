package com.uc.employee_payroll_app.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees_payroll")
@Data  // Lombok will generate all boilerplate code
@NoArgsConstructor  // Generates a no-arg constructor
@AllArgsConstructor // Generates an all-args constructor
public class EmployeeSix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;
}


