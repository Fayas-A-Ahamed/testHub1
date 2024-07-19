package com.wecp.progressive.service;

<<<<<<< HEAD
public class CustomerServiceImplJpa {
=======
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.exception.CustomerAlreadyExistsException;
import com.wecp.progressive.repository.CustomerRepository;

@Service
public class CustomerServiceImplJpa implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        // TODO Auto-generated method stub
        return customerRepository.findAll();
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public int addCustomer(Customers customers)throws CustomerAlreadyExistsException {
        // TODO Auto-generated method stub
        if(customerRepository.existsByNameAndEmail(customers.getName(),customers.getEmail())){
            customerRepository.save(customers);
            return customers.getCustomerId();
        }else{
            throw new CustomerAlreadyExistsException("customer already exists");
        }
        
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        customerRepository.save(customers);
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        customerRepository.deleteById(customerId);
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        List<Customers> list = customerRepository.findAll();
        Collections.sort(list);
        return list;
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
    }
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
    
}