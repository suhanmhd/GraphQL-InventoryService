package com.graphql.inventory_service.resource;

import com.graphql.inventory_service.entity.Product;
import com.graphql.inventory_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
public class ProductController {
    @Autowired
    private ProductService service;

 @QueryMapping
    public List<Product> getProducts(){

     return service.getProducts();
    }
   @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category) {
        return service.getProductsByCategory(category);
    }
    @MutationMapping
    public Product updateStock(@Argument int id, @Argument int stock){
     return service.updateStock(id, stock);
    }
    @MutationMapping
    public Product receiveNewShipment(@Argument int id, @Argument int stock){
        return service.receiveNewShipment(id, stock);
    }

    @MutationMapping
    public  Product deleteProduct(@Argument int id) {
     return service.deleteProduct(id);
    }
}
