import { Pipe, PipeTransform } from '@angular/core';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { Employee } from './view-employees/Employee';

@Pipe({
  name: 'sortSalary'
})
export class SortSalaryPipe implements PipeTransform {

  transform(employees: Array<Employee>, ...args: number[]): Array<Employee> {
    let sortedEmployees = []
    console.log(args);
    if(args[0] < 0){
      sortedEmployees = employees.sort((e1, e2)=> e2.salary - e1.salary);
    }
    else{
      sortedEmployees = employees.sort((e1, e2)=> e1.salary - e2.salary);
    }
    
    return sortedEmployees;
  }

}
