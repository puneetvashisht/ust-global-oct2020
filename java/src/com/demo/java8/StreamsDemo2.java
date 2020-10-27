package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ust.colldemo.Address;
import com.ust.colldemo.Employee;

public class StreamsDemo2 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		Address address1 = new Address(23, "gk", "delhi");
		Employee e1 = new Employee(21, "Ravi", 30000.00, address1);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e3 = new Employee(2, "Amit", 20000.00);

//		employees.add(e1);
//		employees.add(e2);
//		employees.add(e3);
		
		employees.stream()
		.sorted((o1,o2)-> o1.name.compareTo(o2.name))
		.forEach(System.out::println);
		
		Optional<Employee> minSalaryEmployee = employees.stream()
		.min((o1,o2)->o1.salary.compareTo(o2.salary));
		
//		minSalaryEmployee.
		System.out.println(minSalaryEmployee.orElse(e3).getSalary());
		
//		Optional<Employee> emp = findById()
//				emp.somemethod();
		
//		System.out.println(min);
		if(minSalaryEmployee.isPresent()){
				System.out.println(minSalaryEmployee.get());
				minSalaryEmployee.get().getSalary();
		}

	}

}
