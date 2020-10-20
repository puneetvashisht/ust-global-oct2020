package com.ust.oops;

public class EmployeeTest {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
		
		Address address = new Address(233, "kazakuttam", "Trivandrum");
		Employee e = new Employee(21, "Ravi", 30000.00, address);
		System.out.println(e);
		
		Address address2= new Address(23, "Kovalam", "Trivandrum");
		Manager m = new Manager(32, "Ajit", 40000.00, 5, address2);
		System.out.println(m);
		
		Employee employees[] = {e, m};
		
		for(Employee emp : employees){
			emp.incrementSalary();
			System.out.println(emp);
		}

	}

}
