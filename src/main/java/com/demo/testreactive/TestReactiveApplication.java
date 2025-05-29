package com.demo.testreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class TestReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestReactiveApplication.class, args);
	}
}
