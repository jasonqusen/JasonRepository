package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages={"com.example"})  
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
