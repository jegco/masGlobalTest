package usecases.employee;

import io.reactivex.observers.TestObserver;
import model.Employee;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import repositories.IEmployeeRepository;
import support.MockResponse;
import usecases.base.IUseCase;

import java.util.List;


public class EmployeeUseCaseTest {

    /*private TestObserver<List<Employee>> testObserver;

    MockResponse response = new MockResponse();

    @Mock
    IEmployeeRepository employeeRepository;

    IUseCase<List<Employee>, Integer> employeeUseCase;

    @Before
    public void setup() {
        testObserver = new TestObserver<>();
        MockitoAnnotations.initMocks(this);
        employeeUseCase = new EmployeeUseCase();
        Mockito.when(employeeRepository.getEmployees()).thenReturn(response.getEmployeesResponse());
        Mockito.when(employeeRepository.getEmployee(1)).thenReturn(response.getEmployeeResponse());
    }

    @Test
    public void getEmployees() {
        employeeRepository.getEmployees().subscribeWith(testObserver);
        testObserver.assertNoErrors().assertComplete();
    }

    @Test
    public void getEmployee() {
        employeeRepository.getEmployee(1).subscribeWith(testObserver);
        testObserver.assertNoErrors().assertComplete().assertValue(employees -> employees.get(0).getId() == 1);
    }*/
}