package com.example.Warehouse.controller;

import com.example.Warehouse.model.dto.ProductDTO;
import com.example.Warehouse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/{productsId}")
    public ProductDTO findProductById(@PathVariable Integer productId){
        return productService.findProductById(productId);
    }

    @PutMapping
    public ProductDTO addProduct(@Valid @RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
    }

    @PutMapping("/{productId}")
    public ProductDTO updateProduct(@PathVariable int productId,@RequestBody ProductDTO productDTO) {
        return productService.updateProduct(productId, productDTO);
    }
}
