package ec.webmarket.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ec.webmarket.restful.persistence")
public class FacturacionApiRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(FacturacionApiRestApplication.class, args);
    }
}