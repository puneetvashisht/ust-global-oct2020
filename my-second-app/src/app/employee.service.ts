import { Injectable } from '@angular/core';
import { Employee } from './view-employees/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  public employees : Array<Employee> = []

  constructor() { }
}
