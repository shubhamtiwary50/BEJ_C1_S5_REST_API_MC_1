package com.niit.services;

import com.niit.domain.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getAllProducts();


}
