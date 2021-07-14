package com.limhm.springboot.controller;

import com.limhm.springboot.domain.Customer;
import com.limhm.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("customer")
@RestController
public class CustomerController {
    /*
    * Accessing Data with JPA
    * https://spring.io/guides/gs/accessing-data-jpa/
    * */

    @Autowired
    private CustomerRepository repository;

    @GetMapping("")
    public Iterable<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/jpa")
    public String getAllCustomer() {
        repository.save(new Customer("Jack", "Bauer"));
        repository.save(new Customer("Chloe", "O'Brian"));
        repository.save(new Customer("Kim", "Bauer"));
        repository.save(new Customer("David", "Palmer"));
        repository.save(new Customer("Michelle", "Dessler"));

        System.out.println("=== Customers found with findAll() ===");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer.toString());
        }

        System.out.println("=== Customer found with findById(1) ===");
        Customer customer = repository.findById(1);
        System.out.println(customer.toString());

        System.out.println("=== Customer found with findByLastName('Bauer') ===");
        repository.findByLastName("Bauer").forEach(bauer ->{
            System.out.println(bauer.toString());
        });

        return "check your command line";
    }
}
