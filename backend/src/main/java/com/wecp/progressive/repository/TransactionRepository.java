package com.wecp.progressive.repository;

<<<<<<< HEAD
public interface TransactionRepository  {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Transactions;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions,Integer> {
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f
}
