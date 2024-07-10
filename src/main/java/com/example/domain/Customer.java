package com.example.domain;

import com.example.domain.Address;
import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Address address;

    public Customer() {
    }
    public Customer(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}