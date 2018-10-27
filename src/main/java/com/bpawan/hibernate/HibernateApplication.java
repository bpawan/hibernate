package com.bpawan.hibernate;

import com.bpawan.hibernate.dal.entity.Customer;
import com.bpawan.hibernate.dal.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Bean
    CommandLineRunner example(CustomerRepository customerRepository) {
        return (args) -> {
            customerRepository.save(new Customer("pawan bhattarai", "pawan_bhattarai@hotmail.com"));
            customerRepository.save(new Customer("bijay bhattarai", "bijay_bhattarai@hotmail.com"));
        };
    }
}
