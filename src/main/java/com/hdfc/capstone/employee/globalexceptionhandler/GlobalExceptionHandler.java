package com.hdfc.capstone.employee.globalexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hdfc.capstone.employee.exception.InvalidEmployeeIdException;

@RestControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<String> handleExp(InvalidEmployeeIdException exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
}
}
