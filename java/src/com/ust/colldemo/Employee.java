package com.ust.colldemo;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	Double salary;
	Address address;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
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
	@Override
	public int compareTo(Employee o) {
		if(this.id > o.id) {
			return 1;
		}
		else if(this.id < o.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	

}
