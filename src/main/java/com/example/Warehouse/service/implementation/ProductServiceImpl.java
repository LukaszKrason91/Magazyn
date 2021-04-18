package com.example.Warehouse.service.implementation;

import com.example.Warehouse.exceptions.ProductNotFoundException;
import com.example.Warehouse.model.Product;
import com.example.Warehouse.model.dto.ProductDTO;
import com.example.Warehouse.repositories.ProductRepository;
import com.example.Warehouse.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
        productRepository.deleteById(productId);
    }

    @Override
    public ProductDTO findProductById(int productId) {
        return modelMapper.map(productRepository.findById(productId)
                .orElseThrow(ProductNotFoundException::new), ProductDTO.class);
    }

    @Override
    public ProductDTO updateProduct(int productId, ProductDTO productDTO) {
        return null;
    }

    @Override
    public Product getProductEntity(int productId) {
        return productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public ProductDTO findProductByProductName(String productName) {
        return productRepository.findProductByProductName(productName)
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .orElseThrow();
    }
}
