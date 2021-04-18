package com.example.Warehouse.controller;


import com.example.Warehouse.model.dto.CartDTO;
import com.example.Warehouse.service.CartService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/carts")
    public List<CartDTO> findAllCarts(){
        return cartService.findAllCarts();
    }

    @GetMapping("/{cartId}")
    public CartDTO findCartById(@PathVariable int cartId) {
        return cartService.findCartById(cartId);
    }

    @PutMapping
    public CartDTO createCart(@Valid @RequestBody CartDTO cartDTO){
        return cartService.createCart(cartDTO);
    }

    @DeleteMapping("/{cartId}")
    public void deleteCart(@PathVariable int cartId) {
        cartService.deleteCart(cartId);
    }
}
