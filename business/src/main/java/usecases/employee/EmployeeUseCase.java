package usecases.employee;

import io.reactivex.Observable;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IEmployeeRepository;
import usecases.base.ObservableUseCase;

import java.io.IOException;
import java.util.List;

@Service
public class EmployeeUseCase extends ObservableUseCase<List<Employee>, Integer> {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    protected Observable<List<Employee>> buildUseCase(Integer params) {
        return params == null ? employeeRepository.getEmployees() : employeeRepository.getEmployee(params);
    }
}
