package repositories;

import io.reactivex.Observable;
import mappers.EmployeeFactory;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.EmployeeService;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class EmployeeRepository implements IEmployeeRepository {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeFactory employeeFactory;

    @Override
    public Observable<Collection<Employee>> getEmployee(int id) {
        return employeeService.
                getEmployees()
                .map(apiEmployees -> apiEmployees
                .stream()
                        .filter(apiEmployee -> apiEmployee.id == id)
                .map(apiEmployee -> employeeFactory.getEmployee(apiEmployee))
                .collect(Collectors.toList()));
    }

    @Override
    public Observable<Collection<Employee>> getEmployees() {
        return employeeService.
                getEmployees()
                .map(apiEmployees -> apiEmployees
                        .stream()
                        .map(apiEmployee -> employeeFactory.getEmployee(apiEmployee))
                        .collect(Collectors.toList()));
    }
}
