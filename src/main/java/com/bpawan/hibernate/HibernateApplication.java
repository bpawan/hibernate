package com.bpawan.hibernate;

import com.bpawan.hibernate.dal.entity.Customer;
import com.bpawan.hibernate.dal.entity.Product;
import com.bpawan.hibernate.dal.entity.Shop;
import com.bpawan.hibernate.dal.repository.CustomerRepository;
import com.bpawan.hibernate.dal.repository.ShopRepository;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Bean
    CommandLineRunner example(CustomerRepository customerRepository, ShopRepository shopRepository) {
        return (args) -> {
            customerRepository.save(new Customer("pawan bhattarai", "pawan_bhattarai@hotmail.com"));
            customerRepository.save(new Customer("bijay bhattarai", "bijay_bhattarai@hotmail.com"));

            val products = new ArrayList<Product>();

            val hydrogen = new Product();
            hydrogen.setName("Liquid Hydrogen");

            val nitrogen = new Product();
            nitrogen.setName("Liquid Nitrogen");

            products.add(hydrogen);
            products.add(nitrogen);


            val shop = new Shop();
            shop.setName("Awesome Shop");
            shop.setAddress("Milky Way Street 523");
            shop.setCategory("Elements");
            shop.setProducts(products);

            shopRepository.save(shop);
        };
    }
}
