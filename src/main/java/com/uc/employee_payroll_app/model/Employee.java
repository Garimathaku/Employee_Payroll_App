package com.uc.employee_payroll_app.model;




import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees_1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "salary")
    private double salary;
}
