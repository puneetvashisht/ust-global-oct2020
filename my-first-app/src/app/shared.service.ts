import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  messages: Array<string> = [];

  addMessage(message: string){
    this.messages.push(message);
  }
 
  constructor() { }
}
