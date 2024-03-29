package com.eshopper.orderservice.repository;

import com.eshopper.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {
    @Query(value = "SELECT * FROM Orders WHERE customerId = ?1", nativeQuery = true)
    List<Order> findOrdersByCustomerId(Integer customerId);

}
