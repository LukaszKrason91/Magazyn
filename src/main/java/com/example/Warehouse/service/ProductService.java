package com.example.Warehouse.service;

import com.example.Warehouse.model.Product;
import com.example.Warehouse.model.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<ProductDTO> findAllProducts();

    ProductDTO addProduct(ProductDTO productDTO);

    void deleteProduct(int productId);

    ProductDTO findProductById(int productId);

    ProductDTO updateProduct(int productId, ProductDTO productDTO);

    Product getProductEntity(int productId);

    ProductDTO findProductByProductName(String productName);
}
