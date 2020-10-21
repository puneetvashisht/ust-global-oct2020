package com.ust.colldemo;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

//		Set<String> fruits = new HashSet<>();
//
//		fruits.add("orange");
//		fruits.add("apple");
//		fruits.add("apple");
//		fruits.add("grape");
//
//		System.out.println(fruits);

//		System.out.println(fruits);

//		Set<Fruit> fruits = new HashSet<>();
		// Hashset are unordered
//		Set<Fruit> fruits = new LinkedHashSet<>();
		// LinkedHashset are ordered by insertion
		
//		Set<Fruit> fruits = new TreeSet<>();
//		// sorted
//		
//		fruits.add(new Fruit("orange"));
//		fruits.add(new Fruit("apple"));
//		fruits.add(new Fruit("apple"));
//		fruits.add(new Fruit("grape"));
//
//		System.out.println(fruits);
		
		
		Set<Employee> employees = new TreeSet<>(new NameSalaryComparator());
		
		Employee e1 = new Employee(21, "Ravi", 30000.00);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e4 = new Employee(28, "Priya", 40000.00);
		Employee e3 = new Employee(12, "Amit", 20000.00);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e4);
		employees.add(e3);
		
		
		System.out.println(employees);
	}

}
