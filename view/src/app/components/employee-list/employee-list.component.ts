import { Component, Input, OnInit, AfterViewChecked } from '@angular/core';

@Component({
  selector: 'mg-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit, AfterViewChecked {
  @Input()
  employees = [];

  constructor() {}

  ngOnInit() {
    console.log(this.employees);
  }

  ngAfterViewChecked(): void {
    console.log(this.employees);
  }
}
