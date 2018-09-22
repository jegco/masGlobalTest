package controllers;

import io.reactivex.Observable;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import usecases.base.IUseCase;

import java.util.Collection;

@RestController
public class EmployeeController {

    @Autowired
    private IUseCase<Collection<Employee>, Integer> mGetEmployeeUseCase;

    @RequestMapping("employees")
    public Observable<Collection<Employee>> getEmployees(@RequestParam(value = "id", defaultValue = "-1") int id) {
        return mGetEmployeeUseCase.execute(id);
    }
}
