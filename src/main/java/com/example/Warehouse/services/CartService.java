package com.example.Warehouse.services;

import com.example.Warehouse.model1.Cart;
import com.example.Warehouse.model1.dto.CartDTO;

import java.util.List;

public interface CartService {
    List<CartDTO> findAllCarts();

    CartDTO createCart(CartDTO cartDTO);

    void deleteCart(int cartId);

    CartDTO findCartById(int cartId);

    Cart getCartEntity(int cartId);


}
