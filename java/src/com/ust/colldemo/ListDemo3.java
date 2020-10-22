package com.ust.colldemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
		
//		Arrays.sort(a);
		
//		Collections.sort(employees);
//		Collections.sort(employees, new SalaryComparator());
	
		// lamdas functional programs - just pass functions as method arguments
		Collections.sort(employees, ( o1,  o2)-> o1.name.compareTo(o2.name));
		
		Collections.sort(employees , new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {	
				return o1.name.compareTo(o2.name);
			}	
		});
		
		
		System.out.println(employees);
	}

}
