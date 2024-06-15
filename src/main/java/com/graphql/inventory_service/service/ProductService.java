package com.graphql.inventory_service.service;

import com.graphql.inventory_service.entity.Product;
import com.graphql.inventory_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return  productRepository.findByCategory(category);
    }
}
