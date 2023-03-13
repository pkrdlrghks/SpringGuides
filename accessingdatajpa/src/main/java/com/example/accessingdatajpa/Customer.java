package com.example.accessingdatajpa;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer(){}

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName
        );
    }

    public Long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
