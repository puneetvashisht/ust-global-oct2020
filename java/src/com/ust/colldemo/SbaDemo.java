package com.ust.colldemo;

import java.util.ArrayList;
import java.util.List;

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
		printEmployees(employees, new NameStartWithRCondition());
		printEmployees(employees, new IdLessThan10Condition());

	}

	public static void printEmployees(List<Employee> employees, Condition condition) {
//		System.out.println(employees);
		for (Employee e : employees) {
//			if(e.getName().startsWith("R")) {
//				System.out.println(e);
//			}
			if (condition.test(e)) {
				System.out.println(e);
			}
		}
	}

}

interface Condition {
	boolean test(Employee e);
}

class NameStartWithRCondition implements Condition {

	@Override
	public boolean test(Employee e) {
		if (e.getName().startsWith("R")) {
			return true;
		}
		return false;
	}

}

class IdLessThan10Condition implements Condition {

	@Override
	public boolean test(Employee e) {
		if (e.id < 10) {
			return true;
		}
		return false;
	}

}
