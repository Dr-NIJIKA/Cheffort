package com.itlsc.cheffort;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.itlsc.mapper")
@SpringBootApplication
@ComponentScan(basePackages = {"com.itlsc"})
public class CheffortApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheffortApplication.class, args);
    }

}
