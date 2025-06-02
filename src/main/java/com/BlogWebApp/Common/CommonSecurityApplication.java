package com.BlogWebApp.Common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.BlogWebApp.Common.client")
@ComponentScan(basePackages = "com.BlogWebApp.Common")
public class CommonSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonSecurityApplication.class, args);
	}

}
