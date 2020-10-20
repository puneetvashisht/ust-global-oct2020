package com.ust.colldemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListDemo3 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee(21, "Ravi", 30000.00);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e3 = new Employee(12, "Amit", 20000.00);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		boolean result = employees.contains(new Employee(23, "Priya", 50000.00));
		
		System.out.println(employees);
		
//		Collections.sort(employees);
		Collections.sort(employees, new SalaryComparator());
		
		System.out.println(employees);
	}

}
