package cn.linyt.study.productviewserviceturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class ProductViewServiceTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductViewServiceTurbineApplication.class, args);
    }

}
