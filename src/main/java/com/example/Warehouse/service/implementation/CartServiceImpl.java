package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Cart;
import com.example.Warehouse.model.dto.CartDTO;
import com.example.Warehouse.repositories.CartRepository;
import com.example.Warehouse.service.CartService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CartDTO> findAllCarts() {
        return cartRepository.findAll().stream()
                .map(cart -> modelMapper.map(cart, CartDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CartDTO createCart(CartDTO cartDTO) {
        cartRepository.save(modelMapper.map(cartDTO, Cart.class));
        return cartDTO;
    }

    @Override
    public void deleteCart(int cartId) {

    }

    @Override
    public CartDTO findCartById(int cartId) {
        return null;
    }

    @Override
    public Cart getCartEntity(int cartId) {
        return null;
    }
}
