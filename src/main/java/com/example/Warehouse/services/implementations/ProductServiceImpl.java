package com.example.Warehouse.services.implementations;

import com.example.Warehouse.exceptions.ProductNotFoundException;
import com.example.Warehouse.model1.Product;
import com.example.Warehouse.model1.dto.ProductDTO;
import com.example.Warehouse.repositories.ProductRepository;
import com.example.Warehouse.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAllProducts() {

        return productRepository.findAll().stream()
                .map(product -> modelMapper.map(product,ProductDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        productRepository.save(modelMapper.map(productDTO,Product.class));
        return productDTO;
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);

    }

    @Override
    public ProductDTO findProductById(int productId) {
        return modelMapper.map(productRepository.findById(productId)
        .orElseThrow(ProductNotFoundException::new),ProductDTO.class);
    }

    @Override
    public ProductDTO updateProduct(int productId, ProductDTO productDTO) {
        Product product=getProductEntity(productId);
        if ((productDTO.getProductName()!=null)){
            product.setProductName(productDTO.getProductName());
        }
        if((productDTO.getProductPrice() != 0.0)){
            product.setProductPrice(productDTO.getProductPrice());
        }
        return modelMapper.map(productRepository.save(product),ProductDTO.class);
    }

    @Override
    public Product getProductEntity(int productId) {
        return productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
    }
}
