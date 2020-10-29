import { HttpClient } from '@angular/common/http';
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
    // this.employeeService.employees.push({id, name, salary});

    // AJAX call to dummmy server
    // this.httpClient.post('http://localhost:3000/employees',{id, name, salary} )
    this.employeeService.addEmployee({id:null, name, salary})
    .subscribe(res=>console.log(res))



  }

  constructor(public employeeService: EmployeeService) { }

  ngOnInit(): void {
  }

}
