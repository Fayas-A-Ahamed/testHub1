package com.wecp.progressive.dao;


import com.wecp.progressive.entity.Accounts;

<<<<<<< HEAD
import java.util.List;

public interface AccountDAO {
    int addAccount(Accounts accounts);
    Accounts getAccountById(int accountId);
    void updateAccount(Accounts accounts);
    void deleteAccount(int accountId);
    List<Accounts> getAllAccounts();
=======
import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {
    int addAccount(Accounts accounts) throws SQLException;
    Accounts getAccountById(int accountId) throws SQLException;
    void updateAccount(Accounts accounts) throws SQLException;
    void deleteAccount(int accountId) throws SQLException;
    List<Accounts> getAllAccounts() throws SQLException;
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}