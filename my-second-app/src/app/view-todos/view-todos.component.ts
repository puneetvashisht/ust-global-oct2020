import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Todo } from '../Todo';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-view-todos',
  templateUrl: './view-todos.component.html',
  styleUrls: ['./view-todos.component.css']
})
export class ViewTodosComponent implements OnInit {

  todos: Array<Todo>= []

  constructor(private todoService: TodoService) { }

  addTodo(text: string){
    this.todoService.addTodo({text})
    // .subscribe((res: any)=> {
    //       console.log(res);

    // })
  }

  ngOnInit(): void {
    this.todoService.fetchAllTodos()
    .subscribe((res: Array<Todo>)=> {
      console.log('In subscribe ', res);
        this.todos = res;

    })
  
  }

}
