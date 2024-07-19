package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Transactions;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TransactionController {

    public ResponseEntity<List<Transactions>> getAllTransactions() {
        return null;
    }
    public ResponseEntity<Transactions> getTransactionById(int transactionId) {
        return null;
    }
    public ResponseEntity<Integer> addTransaction(Transactions transaction) {
        return null;
=======
import com.wecp.progressive.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    public ResponseEntity<List<Transactions>> getAllTransactions() throws SQLException {
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }
    public ResponseEntity<Transactions> getTransactionById(int transactionId) throws SQLException {
        return ResponseEntity.ok(transactionService.getTransactionById(transactionId));
    }
    public ResponseEntity<Integer> addTransaction(Transactions transaction) throws SQLException {
        transactionService.addTransaction(transaction);
        return ResponseEntity.ok(transaction.getTransactionId());
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
    }
    public ResponseEntity<Void> updateTransaction(int transactionId, Transactions transaction) {
        return null;
    }
    public ResponseEntity<Void> deleteTransaction(int transactionId) {
        return null;
    }
}
