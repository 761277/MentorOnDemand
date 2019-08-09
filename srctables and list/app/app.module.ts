import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee/employee-list.component';
import { EmployeeTableComponent } from './employee/employee-table.component';
import { ChildListComponent } from'./employee/child-list.component';

@NgModule({
  imports: [BrowserModule, FormsModule],
  declarations: [AppComponent, EmployeeComponent, EmployeeListComponent, EmployeeTableComponent, ChildListComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
