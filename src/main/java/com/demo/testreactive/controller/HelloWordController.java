package com.demo.testreactive.controller;


import com.demo.testreactive.controller.handler.HelloWordControllerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class HelloWordController {
    @Bean
    public RouterFunction<ServerResponse> helloWord(HelloWordControllerHandler handler) {
        return route(GET("/hello")
            .and(accept(MediaType.APPLICATION_JSON)), handler::helloWorld);
    }


}
