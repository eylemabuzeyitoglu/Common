package com.BlogWebApp.CommonSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.blogapp.commonsecurity.client")
public class CommonSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonSecurityApplication.class, args);
	}

}
