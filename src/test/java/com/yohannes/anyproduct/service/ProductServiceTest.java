package com.yohannes.anyproduct.service;

import com.yohannes.anyproduct.dao.ProductDAO;
import com.yohannes.anyproduct.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {


    @Test
    void getProducts() {

    }

    @Test
    void addProduct() {

    }

    // this does not involve any spring so it is pure unit test
    @Test
    void getProducts22() {
        ProductService productService= new ProductService();//Arrange  corrosponds-->given
        List<Product> list= productService.getProducts22(); // Act ---> when
        assertNotEquals(3,list.size());// assert ---> then
    }

}