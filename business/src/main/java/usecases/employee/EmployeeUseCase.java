package usecases.employee;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repositories.IEmployeeRepository;
import usecases.base.FluxUseCase;
import usecases.base.IUseCase;

import java.util.List;

@Service
public class EmployeeUseCase extends FluxUseCase<Employee, Integer> {

    @Autowired
    private IEmployeeRepository employeeRepository;


    @Override
    public Flux<Employee> buildUseCase(Integer params) {
        return params == null ? employeeRepository.getEmployees() : employeeRepository.getEmployee(params);
    }
}
