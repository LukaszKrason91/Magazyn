package com.example.Warehouse.services;

import com.example.Warehouse.model1.Product;
import com.example.Warehouse.model1.dto.ProductDTO;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAllProducts();

    ProductDTO addProduct(ProductDTO productDTO);

    void deleteProduct(int productId);

    ProductDTO findProductById(int productId);

    ProductDTO updateProduct(int productId, ProductDTO productDTO);

    Product getProductEntity(int productId);
}
