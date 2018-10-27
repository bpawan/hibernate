package com.bpawan.hibernate.api;

import com.bpawan.hibernate.dal.entity.Customer;
import com.bpawan.hibernate.dal.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static reactor.core.publisher.Flux.fromIterable;

@Component
public class CustomerHandler {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerHandler(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public HandlerFunction<ServerResponse> listCustomers() {
        return request -> ServerResponse
                .ok()
                .body(fromIterable(customerRepository.findAll()), Customer.class);
    }
}
