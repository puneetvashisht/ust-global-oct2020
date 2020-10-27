package springdemo.ust;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import springdemo.ust.entities.Address;
import springdemo.ust.entities.Employee;

@Repository
public class EmployeeJPARepository  implements IEmployeeRepository{
	
	List<Employee> employees = new ArrayList<>();


	@PostConstruct
	public void init(){
		Address address1 = new Address(23, "gk", "delhi");
		Employee e1 = new Employee(21, "Ravi", 30000.00, address1);
		Employee e2 = new Employee(18, "Priya", 50000.00);
		Employee e3 = new Employee(2, "Amit", 20000.00);
	
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
	}

	public List<Employee> findAllEmployees() {
//		return employees;
		return null;
	}

	public int addEmployee(Employee input) {
		return 0;
		
	}

	public boolean findById(int id) {
		return false;
	}

	

}
