import { Component, OnInit } from '@angular/core';
import { EmployeesService } from './services/employees.service';
import { Employee } from './models/employee.mode';
import { Observable } from 'rxjs';
import { isNumber, isNullOrUndefined } from 'util';

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
    if (id) {
      this.selectedId = id;
      this.showBar = true;
      this.employees = this.employeeService.getEmployeesById(id);
    } else {
      this.employees = this.employeeService.getEmployees();
    }
  }

  clearFilters() {
    this.selectedId = undefined;
    this.showBar = false;
    this.employees = this.employeeService.getEmployees();
  }
}
