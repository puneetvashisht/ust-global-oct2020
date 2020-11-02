package com.ust.springangularint.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ust.springangularint.entities.Employee;


public interface EmployeeJpaRepo extends JpaRepository<Employee, Integer>{
	
	public Employee findByName(String name);
	
	@Query("select sum(e.salary) from Employee e")
	public Double findTotalSalary();

}
