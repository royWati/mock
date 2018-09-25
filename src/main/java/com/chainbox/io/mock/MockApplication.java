package com.chainbox.io.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class MockApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MockApplication.class, args);
	}
}
