import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  addEmployee(id:number, name: string, salary:number){
    console.log('Adding Employee method....', id, name, salary);
    this.employeeService.employees.push({id, name, salary});
  }

  constructor(public employeeService: EmployeeService) { }

  ngOnInit(): void {
  }

}
