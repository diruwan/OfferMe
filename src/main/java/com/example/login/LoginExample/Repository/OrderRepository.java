package com.example.login.LoginExample.Repository;

import com.example.login.LoginExample.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    //@Query(value = "SELECT * FROM `orders` WHERE user_id = :userId", nativeQuery = true)
    //List<Order> findByUserId(@Param("userId") Long userId);
    @Query(value = "SELECT * FROM `orders` WHERE item_id= :itemId AND user_id =:userId ", nativeQuery = true)
    Order getOrderId(@Param("itemId") Long itemId, @Param("userId") Long userId);
}
