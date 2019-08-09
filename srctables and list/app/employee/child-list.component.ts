import { Component } from '@angular/core';
import { EmployeeComponent } from './employee.component';

@Component({
  selector: 'app-child-list',
  template: `
    <h1>{{heading}}</h1>
    <ul>
      <li *ngFor="let employee of employees">
       
        {{employee.email}} <br>
       
      </li>
    </ul>
  `
})
export class ChildListComponent extends EmployeeComponent {
  heading = 'Child List';
}
