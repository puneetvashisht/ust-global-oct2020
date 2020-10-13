import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css'],
  providers: [SharedService]
})
export class FirstComponent implements OnInit {

  constructor(private sharedService: SharedService) { }

  logMessage(message: string){
    console.log(message)
    this.sharedService.addMessage(message);
  }

  ngOnInit(): void {
  }

}
