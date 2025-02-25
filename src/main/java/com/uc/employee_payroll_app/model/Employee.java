package com.uc.employee_payroll_app.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees_1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;
}
