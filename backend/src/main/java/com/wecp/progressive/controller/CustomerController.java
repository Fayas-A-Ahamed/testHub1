package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CustomerController {

    public ResponseEntity<List<Customers>> getAllCustomers() {
        return null;
    }

    public ResponseEntity<Customers> getCustomerById(int customerId) {
        return null;
    }

    public ResponseEntity<Integer> addCustomer(Customers customers) {
        return null;
    }

    public ResponseEntity<Void> updateCustomer(int customerId, Customers customers) {
        return null;
    }
    public ResponseEntity<Void> deleteCustomer(int customerId) {
        return null;
    }

    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
        return null;
    }
=======
import com.wecp.progressive.exception.CustomerAlreadyExistsException;
import com.wecp.progressive.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int customerID) throws SQLException {
        return ResponseEntity.ok(customerService.getCustomerById(customerID));
    }

    @PostMapping
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException{
        customerService.addCustomer(customers);
        return ResponseEntity.ok(customers.getCustomerId());
       
    
    }

    @PutMapping
    public ResponseEntity<Void> updateCustomer(@RequestBody Customers customers) throws SQLException {
        customerService.updateCustomer(customers);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{customerID}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerID) throws SQLException {
        customerService.deleteCustomer(customerID);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/fromArrayList/{customerId}")
    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(@PathVariable int cutomerId) {
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(SQLException e){
        return ResponseEntity.status(HttpStatus.FOUND).body("already exists");
    }
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}
