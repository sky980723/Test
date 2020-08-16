package com.example.star;

import java.io.IOException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
@EnableSwagger2
@EnableTransactionManagement
@MapperScan(value = "com.example.star.dao")
public class SpringBootDemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
