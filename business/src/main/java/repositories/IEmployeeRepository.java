package repositories;

import io.reactivex.Observable;
import model.Employee;
import java.util.List;

public interface IEmployeeRepository {
    Observable<List<Employee>> getEmployee(int id);

    Observable<List<Employee>> getEmployees();
}
