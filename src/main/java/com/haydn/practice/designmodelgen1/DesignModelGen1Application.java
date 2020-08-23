package com.haydn.practice.designmodelgen1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DesignModelGen1Application {

	public static void main(String[] args) {
		SpringApplication.run(DesignModelGen1Application.class, args);
	}

}
