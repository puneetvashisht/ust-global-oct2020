package springdemo.ust;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdemo.ust.entities.Employee;



@Service
public class EmployeeService {
	@Autowired
	IEmployeeRepository employeeRepository;

	public List<Employee> fetchAllEmployees() {
		// get list of data from storage
		return employeeRepository.findAllEmployees();
		
	}

	public int addEmployee(Employee input) {
//		if(input.id == already exists), throw an exception
		if(employeeRepository.findById(input.id)){
			throw new RuntimeException("Id already exists");
		}
		
		return employeeRepository.addEmployee(input);
	}
	

}
