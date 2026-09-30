package in.amcbank.amc_bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.amcbank.amc_bank.model.Customer;

@Service
public class CustomerService {

    private final List<Customer> customers = new ArrayList<>();

    

    public CustomerService() {

        customers.add(new Customer(1L, "Navya", "navya@gmail.com", "Delhi", 40000));

        customers.add(new Customer(2L, "Laxmi", "laxmi@gmail.com", "Bengaluru", 50000));

        customers.add(new Customer(3L, "Jyothi", "jyothi@gmail.com", "Mumbai", 45000));
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerById(Long id) {

        for (Customer customer : customers) {

        	if (customer.getId().equals(id)) {
                return customer;
            }
        }

        return null;
    }

    public Customer addCustomer(Long id, Customer updatedCustomer) {

        Customer existingCustomer = getCustomerById(id);

        if (existingCustomer == null) {
            return null;
        }

        existingCustomer.setName(updatedCustomer.getName());
        existingCustomer.setEmail(updatedCustomer.getEmail());
        existingCustomer.setCity(updatedCustomer.getCity());
        existingCustomer.setBalance(updatedCustomer.getBalance());

        return existingCustomer;
    }

    public boolean deleteCustomer(Long id) {

        Customer customer = getCustomerById(id);

        if (customer == null) {
            return false;
        }

        customers.remove(customer);

        return true;
    }

    public List<Customer> findByCity(String city) {

        List<Customer> result = new ArrayList<>();

        for (Customer customer : customers) {

            if (customer.getCity().equalsIgnoreCase(city)) {
                result.add(customer);
            }
        }

        return result;
    }
}