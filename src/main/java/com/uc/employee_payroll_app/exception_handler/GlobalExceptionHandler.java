package com.uc.employee_payroll_app.exception_handler;




//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//
//@ControllerAdvice
//@Slf4j
//public class GlobalExceptionHandler {
//
//    private static final String message = "Exception while processing REST Request";
//
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
//        log.error("Invalid Date Format", exception);
//        return new ResponseEntity<>("Should have date in the Format dd MMM yyyy", HttpStatus.BAD_REQUEST);
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
//        return new ResponseEntity<>("Validation Error: " + exception.getMessage(), HttpStatus.BAD_REQUEST);
//    }
//}


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}