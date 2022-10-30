package com.springboot.daoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.daoapplication.model.Employee;
import com.springboot.daoapplication.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
//	public EmployeeController(EmployeeService employeeService) {
//		super();
//		this.employeeService = employeeService;
//	}
	
	//Create Employee API
	@PostMapping("/saveEmployee")
	private ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
		
	}
	
	//Get All Employee API
	@GetMapping("/getAllEmployess")
	private List<Employee> getAllEmployess(){
		return employeeService.getAllEmployees();
	}
	
	//Get Employee API
	@GetMapping("/getEmployeeById/{id}")
	private Employee getEmployeeById(@PathVariable("id") long employeeId){
		return employeeService.getEmployeeById(employeeId);
	}
	
	//Update an existing employee
	@PutMapping("/updateEmployee/{id}")
	private ResponseEntity<Employee> updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employeeId,employee), HttpStatus.OK);
		
	}
	
	//Delete an existing employee
	@DeleteMapping("/deleteEmployee/{id}")
	private ResponseEntity<String> deleteEmployeeById(@PathVariable("id") long employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		
		return new ResponseEntity<String>("Employee " + employeeId + " delete successfully", HttpStatus.OK);
	}
}
