package services.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import services.EmployeeService;

@Configuration
public class RetrofitConfig {

    private String baseUrl = "http://masglobaltestapi.azurewebsites.net/api/";

    private Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Bean
    public EmployeeService providesEmployeeService() {
        return provideRetrofit().create(EmployeeService.class);
    }
}
