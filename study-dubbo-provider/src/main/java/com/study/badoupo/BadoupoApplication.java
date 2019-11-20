package com.study.badoupo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.badoupo.mapper")
@EnableDubbo
public class BadoupoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadoupoApplication.class, args);
	}

}
