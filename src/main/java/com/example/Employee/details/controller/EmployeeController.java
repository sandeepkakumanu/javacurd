package com.example.Employee.details.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Employee.details.modal.Employee;
import com.example.Employee.details.service.EmployeeService;
@Controller
public class EmployeeController {
	 @Autowired
	    private EmployeeService employeeService;

	    // display list of employees
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	    	List<Employee> allEmployees = employeeService.getAllEmployees();
	    
	    System.out.println(allEmployees);
	        model.addAttribute("listEmployees", allEmployees);
	        return "index";
	

}
}