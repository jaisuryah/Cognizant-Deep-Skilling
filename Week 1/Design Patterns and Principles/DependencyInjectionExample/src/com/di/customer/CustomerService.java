package com.di.customer;

public class CustomerService {
    private CustomerRepository repository;

    // Constructor-based Dependency Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void showCustomerDetails(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer Details: " + customer);
    }
}
