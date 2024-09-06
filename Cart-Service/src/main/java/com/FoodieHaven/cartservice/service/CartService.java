package com.FoodieHaven.cartservice.service;

import com.FoodieHaven.cartservice.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getCartByUserId(Long userId);  // Get cart items by user ID

    Cart addItemToCart(Cart cart); // Add an item to the cart

    void removeItemFromCart(Long cartId); // Remove an item from the cart by cart ID

    void updateItemQuantity(Long cartId, int quantity); // Update the quantity of an item in the cart by cart ID
}
