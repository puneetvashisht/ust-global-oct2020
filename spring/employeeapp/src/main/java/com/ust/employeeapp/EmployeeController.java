package com.ust.employeeapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.employeeapp.entities.Employee;
import com.ust.employeeapp.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/hello")
	public String hello(){
		return "hello world from rest controller";
	}
	
	@GetMapping("/employees/{id}")
	public Employee fetchEmployee(@PathVariable("id")int id){
		System.out.println("In Fetch employee: " + id);
		//service to fetch Employee by id
		//return that employeee
		
		Employee input = new Employee(23, "Vaishali", 34343.34);
		return input;
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployee(){
		return employeeService.fetchAllEmployees();
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee){
		 employeeService.addEmployee(employee);
	}

}
