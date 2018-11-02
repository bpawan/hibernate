package com.bpawan.hibernate.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "Shop")
@Table(name = "shop")
@NoArgsConstructor
@Setter
@Getter
public class Shop {

    @Id
    @GeneratedValue
    private Long id;

    private String address;

    private String category;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Fetch(FetchMode.JOIN)
    private Collection<Product> products = new ArrayList<>();
}
