package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface CustomerRepository  {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
    public boolean existsByNameAndEmail(String name, String email);
>>>>>>> 2d91fb647876eb6e217f2aeb105bdfea96dc6e8f

}
