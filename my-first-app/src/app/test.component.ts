import { Component } from '@angular/core';


@Component({
    selector: 'app-test',
    template: `<h2> Test Component, Name is {{name}} </h2>
    <button (click)=greet()>Greet</button>
    `
})
export class TestComponent{
    now : Date = new Date();
    name: String = 'Puneet Vashisht'


    greet(){
        console.log('Hi Good Afternoon ' + this.name);
    }
}