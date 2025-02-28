package com.uc.employee_payroll_app.dto;




import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private long salary;
    private String gender;
    private String note;
    private String profilePic;
}
