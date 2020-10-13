import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

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

  sampleValidator(control: FormControl): {[s:string]: boolean}{
    if(control.value === 'testtest'){
      return {"anykey": true}
    }
    return null;
  }

  asyncSampleValidator(control: FormControl): Promise<any> | Observable<any>{
const promise = new Promise<any>((resolve,reject)=>{

  //replaced by http calls
  // return this.httpClient.get(baseURL + '/puneet@gmail.com').toPromsie()

  setTimeout(()=>{
    if(control.value === "test@test.com"){
      resolve({"invalid": true})
    }
    else{
      reject(null);
    }
  }, 5000)

});
return promise;
  }

  ngOnInit(): void {
    this.signUpForm = new FormGroup({
  
      email: new FormControl(null , {
        validators: [Validators.required, Validators.email],
        asyncValidators: [this.asyncSampleValidator]
      }),
      password: new FormControl(null , {
        validators: [Validators.required, Validators.minLength(6), this.sampleValidator]
      }),
      cpassword: new FormControl(null , {
        validators: [Validators.required, Validators.minLength(6)]
      })

    })
  }

}
