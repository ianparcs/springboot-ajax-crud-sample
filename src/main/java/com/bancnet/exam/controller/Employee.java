package com.bancnet.exam.controller;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class Employee {

	private String jobPosition;
	private String firstName;
	private String lastName;
	private Integer id;

	private Date birthDate;
	private Float salary;

	public Employee() {

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

}
