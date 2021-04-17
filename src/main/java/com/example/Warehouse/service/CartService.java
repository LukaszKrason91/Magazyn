package com.example.Warehouse.service;

import com.example.Warehouse.model.Cart;
import com.example.Warehouse.model.dto.CartDTO;

import java.util.List;

public interface CartService {

    List<CartDTO> findAllCarts();

    CartDTO createCart(CartDTO cartDTO);

    void deleteCart(int cartId);

    CartDTO findCartById(int cartId);

    Cart getCartEntity(int cartId);
}
