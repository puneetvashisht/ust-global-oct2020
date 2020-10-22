package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ust.colldemo.Address;
import com.ust.colldemo.Employee;

public class DbStuff {
	
	public static List<Employee> findEmployees(){
//		repository.findAll()
		List<Employee> employees = new ArrayList<>();

		Address address1 = new Address(23, "gk", "delhi");
		Employee e1 = new Employee(21, "Ravi", 30000.00, address1);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e3 = new Employee(2, "Amit", 20000.00);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		return employees;
	}

	public static void main(String[] args) {
		
		//Call to database
		List<Employee> employees = findEmployees();
		
//		select count(e) from Employee e where e.salary>25000  
		
		long count = employees.stream()
		.filter((e) -> e.salary>25000)
		.count();
		System.out.println(count);
		
//		select e from Employee e where e.salary>25000  
		employees.stream()
		.filter((e) -> e.salary>25000)
		.forEach((e)->System.out.println(e));
		
		Optional<Employee> emp = employees.stream()
//		.filter((e) -> e.salary>25000)
		.min((e1, e2)-> e1.salary.compareTo(e2.salary));

		System.out.println(emp.get());
		
//		.map((e)-> e.salary)

//		.forEach((e)->System.out.println(e));
		

	}

}
