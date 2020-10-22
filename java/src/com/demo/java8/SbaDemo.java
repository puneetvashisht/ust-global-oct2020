package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.ust.colldemo.Address;
import com.ust.colldemo.Employee;

public class SbaDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		Address address1 = new Address(23, "gk", "delhi");
		Employee e1 = new Employee(21, "Ravi", 30000.00, address1);
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
		
		BiPredicate<Employee, Address> bp = (e, a)-> e.address == a;
		boolean result = bp.test(e2, address1);
		System.out.println(result);
		
//		printEmployees(employees, new NameStartWithRCondition());
		
		printEmployeesWithPredicate(employees, (e) ->  e.name.startsWith("R"), System.out::println);
//		printEmployees(employees, new IdLessThan10Condition());
		printEmployeesWithPredicate(employees, (e) ->  e.id < 10, (e)->System.out.println(e));
		
//		 Consumer<Employee> consumer = (e)->System.out.println(e);
//		 consumer.accept(e2);
		
		
		

	}

//	public static void printEmployees(List<Employee> employees, Condition condition) {
//		for (Employee e : employees) {
//			if (condition.test(e)) {
//				System.out.println(e);
//			}
//		}
//	}
	
	
	
	public static void printEmployeesWithPredicate(List<Employee> employees, Predicate<Employee> condition, Consumer<Employee> consumer) {
		for (Employee e : employees) {
			if (condition.test(e)) {
//				System.out.println(e);
				consumer.accept(e);
			}
		}
	}

}


//void _______ (T t)
//boolean ________ (T t) -> Predicate
//@FunctionalInterface
//interface Condition {
//	boolean test(Employee e);
//}


