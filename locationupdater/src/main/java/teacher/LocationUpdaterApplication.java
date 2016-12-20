package teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
public class LocationUpdaterApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LocationUpdaterApplication.class, args);
    }

}