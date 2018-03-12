import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {

  todos: string[];
  color: string = '#EEEEEE';

  constructor() { 
    this.todos = [
      'Get milk',
      'Prepare coffee',
      'Get ready for office',
      'Check email',
      'Close finished tasks'
    ]
  }

  ngOnInit() {
  }

}
