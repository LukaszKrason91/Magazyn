package com.example.Warehouse.service.implementation;

import com.example.Warehouse.model.Product;
import com.example.Warehouse.model.dto.ProductDTO;
import com.example.Warehouse.repositories.ProductRepository;
import com.example.Warehouse.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDTO> findAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        productRepository.save(modelMapper.map(productDTO, Product.class));
        return productDTO;
    }

    @Override
    public void deleteProduct(int productId) {

    }

    @Override
    public ProductDTO findProductById(int productId) {
        return null;
    }

    @Override
    public ProductDTO updateProduct(int productId, ProductDTO productDTO) {
        return null;
    }

    @Override
    public Product getProductEntity(int productId) {
        return null;
    }
}
