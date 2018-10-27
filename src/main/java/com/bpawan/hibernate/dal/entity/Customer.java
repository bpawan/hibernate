package com.bpawan.hibernate.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column
    private String email;

    public Customer(String name, String email) {
        this.email = email;
        this.name = name;
    }
}
