package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringframeworkApplication {

//	@RequestMapping("/")
//	public String home() {
//		return "Hello";
//	}


	public static void main(String[] args)
	 {
		SpringApplication.run(SpringframeworkApplication.class, args);
	}

}
