import { Component, Input } from '@angular/core';
import { Employee } from '../../models/employee.mode';

@Component({
  selector: 'mg-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  @Input()
  employee: Employee;

  constructor() {}

  getContractType() {
    return this.employee.contractTypeName === 'HourlySalaryEmployee'
      ? 'Hourly Salary Contract'
      : 'Monthly Salary Contract';
  }
}
