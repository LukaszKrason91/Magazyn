package com.example.Warehouse.service;

import com.example.Warehouse.model.Product;
import com.example.Warehouse.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAllProducts();

    ProductDTO addProduct(ProductDTO productDTO);

    void deleteProduct(int productId);

    ProductDTO findProductById(int productId);

    ProductDTO updateProduct(int productId, ProductDTO productDTO);

    Product getProductEntity(int productId);

    ProductDTO findProductByName(String productName);
}
