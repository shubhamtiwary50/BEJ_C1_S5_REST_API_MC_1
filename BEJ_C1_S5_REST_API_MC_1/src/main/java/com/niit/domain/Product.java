package com.niit.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    private String productName;
    @Id
    private int productID;
    private  String productManufacturer;

    public Product() {
    }

    public Product(String productName, int productID, String productManufacturer) {
        this.productName = productName;
        this.productID = productID;
        this.productManufacturer = productManufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID=" + productID +
                ", productManufacturer='" + productManufacturer + '\'' +
                '}';
    }

}
