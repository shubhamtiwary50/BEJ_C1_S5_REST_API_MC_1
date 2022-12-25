package com.niit.controller;


import com.niit.domain.Product;
import com.niit.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {


    ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }


    @PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        Product product1=productService.addProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts(){
        List<Product> list = productService.getAllProducts();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
