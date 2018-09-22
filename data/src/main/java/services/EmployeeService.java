package services;

import io.reactivex.Observable;
import model.DataEmployee;
import org.springframework.stereotype.Component;
import retrofit2.http.GET;

import java.util.List;

@Component
public interface EmployeeService {
    @GET("employees")
    Observable<List<DataEmployee>> getEmployees();
}
