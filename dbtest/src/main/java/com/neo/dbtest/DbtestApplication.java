package com.neo.dbtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value ="com.neo.dbtest.mapper")
public class DbtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbtestApplication.class, args);
	}
}
