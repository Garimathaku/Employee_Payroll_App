package com.uc.employee_payroll_app.dto;



import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;

import lombok.ToString;



public @ToString class EmployeeDTO {



    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces.")
    public String name;



    public String gender;
    public LocalDate startDate;
    public String note;
    @Min(value=500,
    message="Min wage should be more than 500")
    public long salary;
    public String profilePic;
    public List<String>departments;


}

