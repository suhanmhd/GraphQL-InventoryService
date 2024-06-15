package com.graphql.inventory_service;

import com.graphql.inventory_service.entity.Product;
import com.graphql.inventory_service.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServiceApplication {
//	@Autowired
//	private ProductRepository productRepository;
//	@PostConstruct
//	public  void initDB(){
//		List<Product> products = Stream.of(
//				new Product("Dell XPS 13", "Laptop", 999.99f, 50),
//				new Product("Apple MacBook Air", "Laptop", 1099.99f, 30),
//				new Product("HP Spectre x360", "Laptop", 1299.99f, 20),
//				new Product("iPhone 13", "Smartphone", 799.99f, 100),
//				new Product("Samsung Galaxy S21", "Smartphone", 699.99f, 80),
//				new Product("Google Pixel 6", "Smartphone", 599.99f, 70),
//				new Product("Sony WH-1000XM4", "Headphones", 349.99f, 200),
//				new Product("Bose QuietComfort 35 II", "Headphones", 299.99f, 150),
//				new Product("Apple iPad Pro", "Tablet", 999.99f, 60),
//				new Product("Samsung Galaxy Tab S7", "Tablet", 649.99f, 40),
//				new Product("Sony PlayStation 5", "Gaming Console", 499.99f, 25),
//				new Product("Microsoft Xbox Series X", "Gaming Console", 499.99f, 20)
//		).collect(Collectors.toList());
//		productRepository.saveAll(products);
//	}

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
