package com.demo.testreactive.controller.handler;

import com.demo.testreactive.usecase.HelloWordUseCase;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWordControllerHandler {
    private final HelloWordUseCase helloWordUseCase;

    public HelloWordControllerHandler(HelloWordUseCase helloWordUseCase) {
        this.helloWordUseCase = helloWordUseCase;
    }

    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        return helloWordUseCase.helloWorld()
                .flatMap(response -> ServerResponse.ok().bodyValue(response))
                .onErrorResume(e -> ServerResponse.status(500).bodyValue("Internal Server Error"));
    }
}
