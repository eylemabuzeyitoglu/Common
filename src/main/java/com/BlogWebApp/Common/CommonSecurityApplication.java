package com.BlogWebApp.Common;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.BlogWebApp.Common")
public class CommonSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonSecurityApplication.class, args);
	}

}

