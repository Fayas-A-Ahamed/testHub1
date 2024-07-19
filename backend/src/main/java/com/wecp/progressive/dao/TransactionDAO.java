package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Transactions;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDAO {
<<<<<<< HEAD
    int addTransaction(Transactions transaction);
    Transactions getTransactionById(int transactionId);
    void updateTransaction(Transactions transaction);
    void deleteTransaction(int transactionId) ;
    List<Transactions> getAllTransactions();
=======
    int addTransaction(Transactions transaction) throws SQLException;
    Transactions getTransactionById(int transactionId) throws SQLException;
    void updateTransaction(Transactions transaction) throws SQLException;
    void deleteTransaction(int transactionId) throws SQLException;
    List<Transactions> getAllTransactions() throws SQLException;
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}
