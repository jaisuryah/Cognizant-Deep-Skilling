package com.di.customer;

public class Main {
    public static void main(String[] args) {
        // Create the repository (dependency)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.showCustomerDetails("101");
    }
}
