package com.ust.springangularint.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.springangularint.entities.Address;
import com.ust.springangularint.entities.Employee;
import com.ust.springangularint.repos.EmployeeJpaRepo;







@Service
public class EmployeeService {
	@Autowired
//	EmployeeRepository employeeRepository;
	EmployeeJpaRepo employeeRepository;
	


	public List<Employee> fetchAllEmployees() {
		// get list of data from storage
//		return employeeRepository.findAllEmployees();
		return employeeRepository.findAll();
//		return employeeMongoRepository.findAll();
		
	}

	public void addEmployee(Employee input) {
//		if(input.id == already exists), throw an exception
//		if(employeeRepository.findById(input.id)){
//			throw new RuntimeException("Id already exists");
//		}
		
		 employeeRepository.save(input);
//		employeeMongoRepository.save(input);
	}

	public Employee findEmployeeById(int id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
		{
			return emp.get();
		}
		return null;
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		
	}

	public boolean findByName(String name) {
		Employee emp = employeeRepository.findByName(name);
//		emp.getAddresses();
		System.out.println(emp);
		if(emp==null){
			return false;
		}
		return true;
	}

	public Double fetchTotalSalary() {
		return employeeRepository.findTotalSalary();
	}

	public void addAddress(Address address) {
		// TODO Auto-generated method stub
//		addressRepository.save(address);
	}
	

}
