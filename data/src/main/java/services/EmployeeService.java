package services;

import model.DataEmployee;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;

import java.util.List;

@Component
public interface EmployeeService {
    @GET("employees")
    Mono<List<DataEmployee>> getEmployees();
}
