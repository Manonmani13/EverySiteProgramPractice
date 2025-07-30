package com.example.graphql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.graphql.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // This interface will automatically provide CRUD operations for Product entities
    // No additional methods are needed unless custom queries are required
    List<Product> findByCategory(String category);
    
}
