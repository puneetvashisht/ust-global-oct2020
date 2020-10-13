import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {TestComponent} from './test.component';
import { BadgeComponent } from './badge/badge.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component'

@NgModule({
  declarations: [
    AppComponent, TestComponent, BadgeComponent, FirstComponent, SecondComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
