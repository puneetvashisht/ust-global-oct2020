import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-badge',
  templateUrl: './badge.component.html',
  styleUrls: ['./badge.component.css']
})
export class BadgeComponent implements OnInit {

  count: number = 3;

  constructor() { }

  increment(){
    console.log('Increment function..');
    this.count++;
  }

  ngOnInit(): void {
  }

}
