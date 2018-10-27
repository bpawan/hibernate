package com.bpawan.hibernate.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class CustomerRouter {

    @Bean
    public RouterFunction<ServerResponse> route(CustomerHandler customerHandler) {
        return RouterFunctions
                .route(GET("/customers").and(accept(APPLICATION_JSON)), customerHandler.listCustomers());
    }
}
