package com.wecp.progressive.dao;


import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

<<<<<<< HEAD
import java.util.List;

public interface CustomerDAO {
    int addCustomer(Customers customers);
    Customers getCustomerById(int customerId);
    void updateCustomer(Customers customers);
    void deleteCustomer(int customerId);
    List<Customers> getAllCustomers();
    CustomerAccountInfo getCustomerAccountInfo(int customerId);
=======
import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    int addCustomer(Customers customers) throws SQLException;
    Customers getCustomerById(int customerId) throws SQLException;
    void updateCustomer(Customers customers) throws SQLException;
    void deleteCustomer(int customerId) throws SQLException;
    List<Customers> getAllCustomers() throws SQLException;
    CustomerAccountInfo getCustomerAccountInfo(int customerId) throws SQLException;
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}