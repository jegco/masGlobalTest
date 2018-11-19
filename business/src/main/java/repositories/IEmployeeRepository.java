package repositories;

import model.Employee;
import reactor.core.publisher.Flux;

public interface IEmployeeRepository {
    Flux<Employee> getEmployee(int id);

    Flux<Employee> getEmployees();
}
