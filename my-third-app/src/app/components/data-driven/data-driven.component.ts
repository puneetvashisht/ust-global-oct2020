import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-data-driven',
  templateUrl: './data-driven.component.html',
  styleUrls: ['./data-driven.component.css']
})
export class DataDrivenComponent implements OnInit {

  // name = new FormControl('' , [Validators.required, Validators.email]);
  signUpForm: FormGroup;
  constructor() { }

  onSignup(){
    console.log(this.signUpForm.value);
  }

  ngOnInit(): void {
    this.signUpForm = new FormGroup({
  
      email: new FormControl(null , {
        validators: [Validators.required, Validators.email]
      }),
      password: new FormControl(null , {
        validators: [Validators.required, Validators.minLength(6)]
      }),
      cpassword: new FormControl(null , {
        validators: [Validators.required, Validators.minLength(6)]
      })

    })
  }

}
