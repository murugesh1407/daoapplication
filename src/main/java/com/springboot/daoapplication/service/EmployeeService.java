package com.springboot.daoapplication.service;

import java.util.List;

import com.springboot.daoapplication.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long employeeId);
	
	Employee updateEmployee(long employeeId, Employee employee);
	
	void deleteEmployeeById(long employeeId);

}
