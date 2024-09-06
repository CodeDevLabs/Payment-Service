package com.FoodieHaven.cartservice.service.impl;

import com.FoodieHaven.cartservice.model.Cart;
import com.FoodieHaven.cartservice.repository.CartRepository;
import com.FoodieHaven.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    // Get cart items by user ID
    public List<Cart> getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    // Add an item to the cart
    public Cart addItemToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    // Remove an item from the cart by cart ID
    public void removeItemFromCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    // Update the quantity of an item in the cart by cart ID
    public void updateItemQuantity(Long cartId, int quantity) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));
        cart.setQuantity(quantity);
        cartRepository.save(cart);
    }
}
