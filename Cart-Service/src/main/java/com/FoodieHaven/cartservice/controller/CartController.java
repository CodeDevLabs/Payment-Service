package com.FoodieHaven.cartservice.controller;

import com.FoodieHaven.cartservice.model.Cart;
import com.FoodieHaven.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // Get cart items by user ID
    @GetMapping("/{userId}")
    public List<Cart> getCartByUserId(@PathVariable Long userId) {
        return cartService.getCartByUserId(userId);
    }

    // Add an item to the cart
    @PostMapping("/add")
    public Cart addItemToCart(@RequestBody Cart cart) {
        return cartService.addItemToCart(cart);
    }

    // Remove an item from the cart by cart ID
    @DeleteMapping("/remove/{cartId}")
    public void removeItemFromCart(@PathVariable Long cartId) {
        cartService.removeItemFromCart(cartId);
    }

    // Update the quantity of an item in the cart by cart ID
    @PutMapping("/update/{cartId}")
    public void updateItemQuantity(@PathVariable Long cartId, @RequestBody int quantity) {
        cartService.updateItemQuantity(cartId, quantity);
    }
}
