import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { ViewCoursesComponent } from './view-courses/view-courses.component';
import { ViewEmployeesComponent } from './view-employees/view-employees.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CardComponent } from './card/card.component';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { ViewTodosComponent } from './view-todos/view-todos.component';
import { AddTodoComponent } from './add-todo/add-todo.component';
import { SentenceCasePipe } from './sentence-case.pipe';
import { SearchTextPipe } from './search-text.pipe';


const routes: Routes = [
  // {path:'', component: ViewEmployeesComponent},
  // {path:'add', component: AddEmployeeComponent},
  // {path:'courses', component: ViewCoursesComponent},
  // {path:'details/:id', component: EmployeeDetailsComponent},
  {path: '', component: ViewTodosComponent},
  {path: 'add', component: AddTodoComponent},
  {path:'**', component: NotFoundComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    ViewCoursesComponent,
    ViewEmployeesComponent,
    AddEmployeeComponent,
    ParentComponent,
    ChildComponent,
    CardComponent,
    EmployeeDetailsComponent,
    ViewTodosComponent,
    AddTodoComponent,
    SentenceCasePipe,
    SearchTextPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
