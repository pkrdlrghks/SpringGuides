package com.example.demo.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    private Customer(){}

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }

    @Override
    public String toString(){
        return String.format(
                "Customer[id=%d, firstName='%s' lastName='%s']",
                id, firstName, lastName
        );
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
