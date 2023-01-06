package com.alan.springmvcpart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Springmvcpart1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springmvcpart1Application.class, args);
	}

}
