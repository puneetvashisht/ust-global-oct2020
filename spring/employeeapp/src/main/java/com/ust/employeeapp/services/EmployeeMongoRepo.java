package com.ust.employeeapp.services;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ust.employeeapp.mongo.entities.Employee;



public interface EmployeeMongoRepo extends MongoRepository<Employee, Integer>{
	
	public Employee findByName(String name);

}
