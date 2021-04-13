package com.example.Warehouse.services.implementations;

import com.example.Warehouse.exceptions.CartNotFoundException;
import com.example.Warehouse.model1.Cart;
import com.example.Warehouse.model1.dto.CartDTO;
import com.example.Warehouse.repositories.CartRepository;
import com.example.Warehouse.services.CartService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CartDTO> findAllCarts() {
        return cartRepository.findAll().stream().
                map(cart -> modelMapper.map(cart, CartDTO.class)).collect(Collectors.toList());
    }

    @Override
    public CartDTO createCart(CartDTO cartDTO) {
        cartRepository.save((modelMapper.map(cartDTO, Cart.class)));
        return cartDTO;
    }

    @Override
    public void deleteCart(int cartId) {
        cartRepository.deleteById(cartId);

    }

    @Override
    public CartDTO findCartById(int cartId) {
        return modelMapper.map(cartRepository.findById(cartId).
                orElseThrow(CartNotFoundException::new), CartDTO.class);
    }

    @Override
    public Cart getCartEntity(int cartId) {
        return cartRepository.findById(cartId).orElseThrow(CartNotFoundException::new);
    }


}
