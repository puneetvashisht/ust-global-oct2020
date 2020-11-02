package com.ust.springangularint.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Employee implements Comparable<Employee> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;

	public String name;
	public Double salary;
	
	@Version
	int version;
	
	@OneToMany(mappedBy = "employee", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Address> addresses;


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

	
	public Employee(int id, String name, double salary, List<Address> addresses) {
		this(id, name, salary);
		this.addresses = addresses;
	}




	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
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

	public void incrementSalary() {
		this.salary *= 1.1;
	}

	public void incrementSalary(int newSalary) {
		this.salary += newSalary;
	}
	
	
	

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary  + "]";
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + addresses + "]";
	}

	// @Override
	// public int compareTo(Employee o) {
	// if(this.id > o.id) {
	// return 1;
	// }
	// else if(this.id < o.id) {
	// return -1;
	// }
	// else {
	// return 0;
	// }
	// }
	public int compareTo(Employee o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
