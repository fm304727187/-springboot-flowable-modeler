package com.example.demo;

import com.example.demo.config.ApplicationConfiguration;
import com.example.demo.servlet.AppDispatcherServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
@ComponentScan(basePackages = {"com.example.demo"})
@EnableTransactionManagement
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
