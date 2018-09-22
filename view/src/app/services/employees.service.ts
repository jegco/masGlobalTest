import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../models/employee.mode';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {
  constructor(private http: HttpClient) {}

  getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>('http://localhost:8080/employees');
  }

  getEmployeesById(id: number) {
    return this.http.get<Employee[]>(
      'http://localhost:8080/employees/' + id
    );
  }
}
