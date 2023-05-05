package com.hdfc.capstone.employee.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	
	private long employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	
	
	public Employee() {
		super();
	}
	public Employee(long employeeId, String employeeName, LocalDate dateOfBirth) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.dateOfBirth = dateOfBirth;
}

	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
