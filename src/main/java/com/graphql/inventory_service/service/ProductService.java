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

    public  Product updateStock(int id, int quantity) {
        Product existingProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found with id"+id));
        existingProduct.setStock(quantity);
        return  productRepository.save(existingProduct);
    }
    public  Product receiveNewShipment(int id, int quantity) {
        Product existingProduct = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found with id"+id));
        existingProduct.setStock(existingProduct.getStock()+quantity);
        return  productRepository.save(existingProduct);
    }
    public  Product deleteProduct(int id){
        Product product = productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found with id"+id));
        productRepository.delete(product);
        return  product;
    }


}
