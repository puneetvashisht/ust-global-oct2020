import { Injectable } from '@angular/core';
import { Employee } from './view-employees/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  public employees : Array<Employee> = [
    {id: 234, name:'Ravi', salary: 34343.33},
    {id: 4, name:'Priya', salary: 44343.33},
    {id: 34, name:'Samaira', salary: 24343.33}
  ]

  constructor() { }
}
