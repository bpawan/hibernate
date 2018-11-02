package com.bpawan.hibernate.dal.repository;

import com.bpawan.hibernate.dal.entity.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Long> {
}
