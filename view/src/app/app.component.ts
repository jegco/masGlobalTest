import { Component, OnInit } from '@angular/core';
import { EmployeesService } from './services/employees.service';
import { Employee } from './models/employee.mode';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';

  employees: Observable<Employee[]>;

  selectedId: number;

  showBar = false;

  constructor(private employeeService: EmployeesService) {}

  ngOnInit(): void {
    this.employees = this.employeeService.getEmployees();
  }

  searchEmployees(id: number) {
    this.selectedId = id;
    this.showBar = true;
    this.employees = this.employeeService.getEmployeesById(id);
  }

  clearFilters() {
    this.selectedId = undefined;
    this.showBar = false;
    this.employees = this.employeeService.getEmployees();
  }
}
