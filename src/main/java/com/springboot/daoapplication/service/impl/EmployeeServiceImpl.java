package com.springboot.daoapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.daoapplication.exception.ResourceNotFoundException;
import com.springboot.daoapplication.model.Employee;
import com.springboot.daoapplication.repository.EmployeeRepository;
import com.springboot.daoapplication.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//		super();
//		this.employeeRepository = employeeRepository;
//	}
	
	//Create Employee API
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		return employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", employeeId));
	}

	@Override
	public Employee updateEmployee(long employeeId, Employee employee) {
		
		Employee existingEmployee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", employeeId));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		return employeeRepository.save(existingEmployee);
	}

	@Override
	public void deleteEmployeeById(long employeeId) {
		
		Employee existingEmployee = employeeRepository.findById(employeeId).
				orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", employeeId));
		employeeRepository.deleteById(employeeId);
	}
}
