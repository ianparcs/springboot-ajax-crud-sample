package com.bancnet.exam.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bancnet.exam.controller.Employee;

@Repository
public class EmployeeDao implements BaseDao<Employee> {

	private List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void add(Employee employee) {
		System.out.println(employee.getFirstName());
		employees.add(employee);
	}

	@Override
	public void edit(Employee employee) {

	}

	@Override
	public void delete(Employee employee) {
		int id = employee.getId();
		employees.remove(id);

	}

	@Override
	public List<Employee> retrieve() {
		return employees;
	}

}
