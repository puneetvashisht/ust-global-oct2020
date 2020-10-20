package com.ust.oops;

public class Manager extends Employee {

	int numberOfEmployees;
	

	public Manager(int id, String name, double salary, int numberOfEmployees) {
		super(id, name, salary);
		this.numberOfEmployees = numberOfEmployees;
	}
	public Manager(int id, String name, double salary, int numberOfEmployees, Address address) {
		this(id, name, salary,numberOfEmployees);
		this.address = address;
	}

	public void approveLeave(){
		System.out.println("Never approve any leave");
	}
	
	@Override
	public void incrementSalary(){
		this.salary *= 1.2;
	}
	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", id=" + id + ", name=" + name + ", salary="
				+ salary + ", address=" + address + "]";
	}

	
	
	
	
}
