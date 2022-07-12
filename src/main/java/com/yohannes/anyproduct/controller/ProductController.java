package com.yohannes.anyproduct.controller;

import com.yohannes.anyproduct.api.StoreApi;
import com.yohannes.anyproduct.domain.Product;
import com.yohannes.anyproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController implements StoreApi {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<com.yohannes.anyproduct.models.Product>> getAllProducts() {
        return new ResponseEntity(productService.getProducts(),HttpStatus.ACCEPTED);
    }
}
