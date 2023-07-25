package com.example.demo.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args){
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
        return (args)->{
            //save a few customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Kim", "O`Brian"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michell", "Dessler"));

            //fetch all customers

            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()){
                log.info(customer.toString());
            }
            log.info("");

            //fetch an individual customer by ID
            Customer customer = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("---------------------------------");
            log.info(customer.toString());
            log.info("");

            //fetch Customers by last name
            log.info("Customer found with find ByLast Name('Bauer'):");
            log.info("----------------------------------------------");
            repository.findByLastName("Bauer").forEach(baure ->{
                log.info(baure.toString());
            });

            //for(Customer bauer : repository.findByLastName("Bauer")){
            //    log.info(bauer.toString());
            //}

            log.info("");

        };
    }
}
