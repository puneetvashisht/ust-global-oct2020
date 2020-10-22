package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.ust.colldemo.Address;
import com.ust.colldemo.Employee;

public class SbaDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		Employee e1 = new Employee(21, "Ravi", 30000.00);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e3 = new Employee(2, "Amit", 20000.00);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

//		System.out.println(employees); 
		//boolean test(Employee e);
//		
//		Condition c = (Employee e) ->  {
//			System.out.println(e.name);
//			return e.name.startsWith("R");
//		};
		
		BiPredicate<Employee, Address> bp = (e, a)-> true;
		
//		printEmployees(employees, new NameStartWithRCondition());
		
		printEmployeesWithPredicate(employees, (e) ->  e.name.startsWith("R"));
//		printEmployees(employees, new IdLessThan10Condition());
		printEmployeesWithPredicate(employees, (e) ->  e.id < 10);

	}

//	public static void printEmployees(List<Employee> employees, Condition condition) {
//		for (Employee e : employees) {
//			if (condition.test(e)) {
//				System.out.println(e);
//			}
//		}
//	}
	
	public static void printEmployeesWithPredicate(List<Employee> employees, Predicate<Employee> condition) {
		for (Employee e : employees) {
			if (condition.test(e)) {
				System.out.println(e);
			}
		}
	}

}

//@FunctionalInterface
//interface Condition {
//	boolean test(Employee e);
//}


