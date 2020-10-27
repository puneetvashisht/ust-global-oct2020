package springdemo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springdemo.ust.EmployeeService;
import springdemo.ust.entities.Employee;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class EmployeeTest {
	
	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testFetchAllEmployees(){
		List<Employee> employees = employeeService.fetchAllEmployees();
		System.out.println(employees);
		assertEquals(employees.size(), 3);
	}
	
//	@Test
	public void testAddEmployee(){
		Employee input = new Employee(23, "Vaishali", 34343.34);
		int total = employeeService.addEmployee(input);
		assertEquals("Expect 4 after adding another employee",total, 4);
	}
	
//	@Test(expected=RuntimeException.class)
	public void testAddEmployeeThatAlreadyExists(){
		Employee input = new Employee(21, "Vaishali", 34343.34);
		employeeService.addEmployee(input);
//		assertEquals("Expect 4 after adding another employee",total, 4);
	}
	
	// findById, else NotFoundException
	// sortListOfEmployees
	// updateExistingEmployee, else NotFoundException
	// delete
	// Employee with least, max salaries
	// Sum of salaries
	// findAll Employees that match location="kazakuttam"

}
