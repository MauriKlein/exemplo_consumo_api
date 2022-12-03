package com.dh.meli.exemplo_consumo_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ExemploConsumoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemploConsumoApiApplication.class, args);
    }

}
