package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getByEmployeeId(Long id) {
		return employeeRepository.findById(id);
	}
	
	public void deleteEmployee(long id) {
		 employeeRepository.deleteById(id);
	}
}
