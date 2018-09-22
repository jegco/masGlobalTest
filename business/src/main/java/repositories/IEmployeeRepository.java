package repositories;

import io.reactivex.Observable;
import model.Employee;

import java.util.Collection;


public interface IEmployeeRepository {
    Observable<Collection<Employee>> getEmployee(int id);

    Observable<Collection<Employee>> getEmployees();
}
