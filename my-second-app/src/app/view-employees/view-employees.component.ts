import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from './Employee';


@Component({
  selector: 'app-view-employees',
  templateUrl: './view-employees.component.html',
  styleUrls: ['./view-employees.component.css']
})
export class ViewEmployeesComponent implements OnInit {

  // employees : Array<Employee> = [
  //   {id: 234, name:'Ravi', salary: 34343.33},
  //   {id: 4, name:'Priya', salary: 44343.33},
  //   {id: 34, name:'Samaira', salary: 24343.33}
  // ]

  constructor(public employeeService: EmployeeService) { }

  ngOnInit(): void {
  }

}
