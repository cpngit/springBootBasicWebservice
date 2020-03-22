package com.cpn.spring.BasicSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BasicSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(BasicSpringBootProjectApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
