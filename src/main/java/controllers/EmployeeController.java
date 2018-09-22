package controllers;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usecases.base.IUseCase;

import java.util.List;

@RestController
@CrossOrigin(origins = "${restcontroller.cross-origin-location}")
public class EmployeeController {

    @Autowired
    private IUseCase<List<Employee>, Integer> mGetEmployeeUseCase;

    @RequestMapping("${restcontroller.get-employees-url}")
    public List<Employee> getEmployees() {
        return mGetEmployeeUseCase.execute(null).blockingSingle();
    }

    @RequestMapping("${restcontroller.get-employee-with-id-url}")
    public List<Employee> getEmployee(@PathVariable("id") int id) {
        return mGetEmployeeUseCase.execute(id).blockingSingle();
    }
}
