package com.FoodieHaven.cartservice.repository;

import com.FoodieHaven.cartservice.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    // Find cart items by user ID
    List<Cart> findByUserId(Long userId);
}
