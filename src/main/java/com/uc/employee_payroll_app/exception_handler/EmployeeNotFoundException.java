package com.uc.employee_payroll_app.exception_handler;



public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}


