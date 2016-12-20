package teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableScheduling
public class LocationSimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationSimulatorApplication.class, args);
    }
}
