package repositories;

import mappers.EmployeeFactory;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import services.EmployeeService;

@Component
public class EmployeeRepository implements IEmployeeRepository {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeFactory employeeFactory;

    @Override
    public Flux<Employee> getEmployee(int id) {
        return employeeService.
                getEmployees()
                .flatMapMany(Flux::fromIterable)
                .filter(dataEmployee -> dataEmployee.getId() == id)
                .map(dataEmployee -> employeeFactory.getEmployee(dataEmployee));
    }

    @Override
    public Flux<Employee> getEmployees() {
        return employeeService.
                getEmployees()
                .flatMapMany(Flux::fromIterable)
                .map(dataEmployee -> employeeFactory.getEmployee(dataEmployee));
    }
}
