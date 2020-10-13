import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css'],
  providers: [SharedService]
})
export class SecondComponent implements OnInit {

  // @Autowired
  // SharedService sharedService

  constructor(public sharedService: SharedService) {
   }



  ngOnInit(): void {

  }

}
