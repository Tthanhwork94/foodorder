package com.hqtcsdl.foodorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class HqtcsdlApplication {

	public static void main(String[] args) {
		SpringApplication.run(HqtcsdlApplication.class, args);
	}

}
