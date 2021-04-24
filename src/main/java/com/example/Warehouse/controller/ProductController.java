package com.example.Warehouse.controller;

import com.example.Warehouse.model1.dto.ProductDTO;
import com.example.Warehouse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> findAllProducts(){ return productService.findAllProducts();}

    @GetMapping("/productId")
    public ProductDTO findProductById(@PathVariable int productId){
        return productService.findProductById(productId);
    }
    @PutMapping
    public ProductDTO addProduct(@Valid @RequestBody ProductDTO productDTO){
        return  productService.addProduct(productDTO);
    }
    @DeleteMapping
    public void deleteProduct(@PathVariable int productId){
        productService.deleteProduct(productId);
    }
    @PutMapping("/{productId}")
    public ProductDTO updateProduct(@PathVariable int productId,@RequestBody ProductDTO productDTO){
        return productService.updateProduct(productId,productDTO);
    }
}
