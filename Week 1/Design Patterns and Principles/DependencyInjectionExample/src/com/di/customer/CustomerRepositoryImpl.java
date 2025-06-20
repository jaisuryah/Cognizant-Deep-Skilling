package com.di.customer;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // Simulated data fetching
        return "Customer[id=" + id + ", name=Jai]";
    }
}
