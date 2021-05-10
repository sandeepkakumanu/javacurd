package com.example.Employee.details.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Employee.details.modal.Employee;
import com.example.Employee.details.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  // display list of employees
  @GetMapping("/getAll")
  public ResponseEntity<?> viewHomePage(Model model) {
    List<Employee> allEmployees = employeeService.getAllEmployees();

    return ResponseEntity.ok(allEmployees);
  }

  // saving the employee data
  @PostMapping("/save")
  public ResponseEntity<?> saveEmployee(@Valid @RequestBody Employee employee) {

    return ResponseEntity.created(URI.create("employee/save"))
        .body(employeeService.savEmplyee(employee));

  }
}