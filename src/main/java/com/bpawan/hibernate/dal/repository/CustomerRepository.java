package com.bpawan.hibernate.dal.repository;

import com.bpawan.hibernate.dal.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
