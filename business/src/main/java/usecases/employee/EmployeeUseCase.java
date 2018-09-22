package usecases.employee;

import io.reactivex.Observable;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IEmployeeRepository;
import usecases.base.ObservableUseCase;

import java.util.Collection;

@Service
public class EmployeeUseCase extends ObservableUseCase<Collection<Employee>, Integer> {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    protected Observable<Collection<Employee>> buildUseCase(Integer params) {
        if (params == -1) {
            return employeeRepository.getEmployees();
        } else {
            return employeeRepository.getEmployee(params);
        }
    }
}
