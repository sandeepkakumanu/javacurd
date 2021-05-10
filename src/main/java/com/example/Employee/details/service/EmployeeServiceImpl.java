package com.example.Employee.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.details.modal.Employee;
import com.example.Employee.details.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee savEmplyee(Employee employee) {
		return employeeRepository.save(employee);
	}
}