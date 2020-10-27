package springdemo.ust;

import java.util.List;

import org.springframework.stereotype.Repository;

import springdemo.ust.entities.Employee;

@Repository
public interface IEmployeeRepository {
	
	

	public List<Employee> findAllEmployees();

	public int addEmployee(Employee input);

	public boolean findById(int id);

	

}
