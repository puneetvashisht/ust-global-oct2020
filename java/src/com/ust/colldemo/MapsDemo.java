package com.ust.colldemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		Map<String, Employee> employeesMap = new TreeMap<>();
		
		Employee e1 = new Employee(21, "Ravi", 30000.00);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e4 = new Employee(28, "Priya", 40000.00);
		Employee e3 = new Employee(12, "Amit", 20000.00);
		
		employeesMap.put("Ravi", e1);
		employeesMap.put("Priya", e2);
		employeesMap.put("Priya" ,e4);
		employeesMap.put("Amit", e3);
		
		System.out.println(employeesMap);
		
		System.out.println(employeesMap.get("Ravi"));
		
		System.out.println(employeesMap.keySet());
		
		for(String key: employeesMap.keySet()) {
			System.out.println(key);
			System.out.println(employeesMap.get(key));
		}
		
		for(Entry<String, Employee> entry: employeesMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		

	}

}
