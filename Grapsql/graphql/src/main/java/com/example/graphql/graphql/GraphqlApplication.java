package com.example.graphql.graphql;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.graphql.entity.Product;
import com.example.graphql.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.graphql")
@EnableJpaRepositories(basePackages = "com.example.graphql.repository")
@EntityScan(basePackages = "com.example.graphql.entity")
public class GraphqlApplication {

	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
public void init() {
    // System.out.println("GraphQL Application has started successfully!");
    
    // productRepository.deleteAll(); // ✅ avoid duplicates

    // List<Product> products = Stream.of(
    //     new Product("Laptop", "Electronics", 999.99, 50),
    //     new Product("Smartphone", "Electronics", 499.99, 100),
    //     new Product("Coffee Maker", "Home Appliances", 79.99, 30),
    //     new Product("Blender", "Home Appliances", 59.99, 20),
    //     new Product("Headphones", "Electronics", 199.99, 75),
    //     new Product("Smartwatch", "Electronics", 249.99, 40),
    //     new Product("Microwave Oven", "Home Appliances", 89.99, 25),
    //     new Product("Gaming Console", "Electronics", 299.99, 60),
    //     new Product("Electric Kettle", "Home Appliances", 39.99, 15),
    //     new Product("Wireless Charger", "Electronics", 29.99, 80)
    // ).collect(Collectors.toList());
    
    // productRepository.saveAll(products);
}


	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
