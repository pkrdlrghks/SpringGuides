package com.example.ReactREST.greglturnquist.payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee(){}

    public Employee(String firstName, String lastName, String description){
        this.firstName=firstName;
        this.lastName=lastName;
        this.description=description;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, firstName, lastName, description);
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

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Employee{"+
                "id="+id+
                ",firstName="+firstName+
                ",lastName="+lastName+
                ",descrition="+description+
                "};";
    }
}
