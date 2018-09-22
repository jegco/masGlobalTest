package services;

import io.reactivex.Observable;
import model.APIEmployee;
import org.springframework.stereotype.Component;
import retrofit2.http.GET;

import java.util.Collection;

@Component
public interface EmployeeService {
    @GET("employees")
    Observable<Collection<APIEmployee>> getEmployees();
}
