package com.ust.oops;

public class Employee{
	
	int id;
	String name;
	double salary;
	Address address;
	

	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(int id, String name, double salary, Address address) {
		this(id, name, salary);
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void incrementSalary(){
		this.salary *= 1.1;
	}
	
	public void incrementSalary(int newSalary){
		this.salary += newSalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	

}
