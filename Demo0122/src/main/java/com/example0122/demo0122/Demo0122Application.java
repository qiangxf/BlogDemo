package com.example0122.demo0122;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example0122.demo0122.mapper")
public class Demo0122Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0122Application.class, args);
	}
}
