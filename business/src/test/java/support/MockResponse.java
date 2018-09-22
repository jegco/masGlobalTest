package support;

import io.reactivex.Observable;
import model.Employee;
import model.HourlySalaryContractEmployee;
import model.MonthlySalaryContractEmployee;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

public class MockResponse {

    public Observable<List<Employee>> getEmployeesResponse() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlySalaryContractEmployee(0, "", "", "", "", 0));
        employees.add(new MonthlySalaryContractEmployee(0, "", "", "", "", 0));
        return Observable
                .just(employees);
    }

    public Observable<List<Employee>> getEmployeeResponse() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlySalaryContractEmployee(1, "", "", "", "", 0));
        return Observable
                .just(employees);
    }
}
