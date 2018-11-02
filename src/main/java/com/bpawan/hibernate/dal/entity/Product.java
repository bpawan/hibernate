package com.bpawan.hibernate.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "product")
@Table(name = "product")
@NoArgsConstructor
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
