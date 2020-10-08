import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './view-employees/Employee';


const baseUrl: string = 'http://localhost:3000/employees/'

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  constructor(public httpClient: HttpClient) { }

  addEmployee(employee: Employee){
    return this.httpClient.post(baseUrl,employee )
  }

  deleteEmployee(index: number){
    return this.httpClient.delete(baseUrl + index)
  }

  fetchAllEmployees(){
    return this.httpClient.get(baseUrl);
  }

  public employees : Array<Employee> = []

  
}


