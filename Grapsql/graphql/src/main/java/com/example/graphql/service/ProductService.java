package com.example.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphql.entity.Product;
import com.example.graphql.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public Product receiveNewProduct(int id,int quantity) {
        Product product = productRepository.findById(id).or;
        return productService.receiveNewProduct(id, quantity);
    }

    public Product updateStock(int id, int stock) {
        // TODO Auto-generated method stub
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found")+ id);
        product.setStock(stock);
    
        return productRepository.save(product);
    }
}
