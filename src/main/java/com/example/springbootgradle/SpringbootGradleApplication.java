package com.example.springbootgradle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hpalt.test"})
@MapperScan("com.hpalt.test.mapper")
public class SpringbootGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGradleApplication.class, args);
    }

}
