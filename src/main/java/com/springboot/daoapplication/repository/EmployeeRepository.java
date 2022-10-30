package com.springboot.daoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.daoapplication.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
