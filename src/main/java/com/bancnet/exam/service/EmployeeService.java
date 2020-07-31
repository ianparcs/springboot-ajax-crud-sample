package com.bancnet.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancnet.exam.controller.Employee;
import com.bancnet.exam.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void add(Employee employee) {
		if (employee != null) {
			employeeDao.add(employee);
		}

	}

	public void edit(Employee employee) {
		List<Employee> employees = retrieve();
		if (employees.contains(employee)) {

		}

	}

	public void delete(String id) {
		List<Employee> employees = retrieve();

		Employee deleteEmployee = null;

		for (Employee employee : employees) {
			if (employee.getId().equals(id)) {
				deleteEmployee = employee;
			}
		}

		if (deleteEmployee != null) {
			employees.remove(deleteEmployee);
		}
	}

	public List<Employee> retrieve() {
		return employeeDao.retrieve();
	}

}
