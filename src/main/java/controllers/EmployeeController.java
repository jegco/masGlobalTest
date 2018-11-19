package controllers;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import usecases.base.IUseCase;

@RestController
@CrossOrigin(origins = "${restcontroller.cross-origin-location}")
public class EmployeeController {

    @Autowired
    private IUseCase<Employee, Integer> mGetEmployeeUseCase;

    @GetMapping("${restcontroller.get-employees-url}")
    public Flux<Employee> getEmployees() {
        return mGetEmployeeUseCase.execute(null);
    }

    @GetMapping("${restcontroller.get-employee-with-id-url}")
    public Flux<Employee> getEmployee(@PathVariable("id") int id) {
        return mGetEmployeeUseCase.execute(id);
    }
}
