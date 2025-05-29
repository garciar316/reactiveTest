package com.demo.testreactive.usecase;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class HelloWordUseCase {
    public Mono<String> helloWorld() {
        return Mono.just("Hello World");
    }
}
