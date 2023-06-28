package com.example.spring.aop;

import com.example.spring.aop.services.PrintingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ApplicationContext context = SpringApplication.run(Application.class, args);
		PrintingService printingService = context.getBean(PrintingService.class);
		printingService.print();
	}
}
