package com.ust.colldemo;

import java.util.Comparator;

public class NameSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.name.equals(o2.name)) {
			return o1.salary.compareTo(o2.salary);
		}
		return o1.name.compareTo(o2.name);
	}

}
