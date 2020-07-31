package com.bancnet.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bancnet.exam.ServiceResponse;
import com.bancnet.exam.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		employeeService.add(employee);
		ServiceResponse<Employee> response = new ServiceResponse<>("success", employee);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@GetMapping("/getEmployees")
	public ResponseEntity<Object> retreieveAllEmployee() {
		List<Employee> employees = employeeService.retrieve();
	
		ServiceResponse<List<Employee>> response = new ServiceResponse<>("success", employees);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

}
