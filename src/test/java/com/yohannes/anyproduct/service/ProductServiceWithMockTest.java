package com.yohannes.anyproduct.service;

import com.yohannes.anyproduct.dao.ProductDAO;
import com.yohannes.anyproduct.domain.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class) // this will open Mock and close when it is done after each test
class ProductServiceWithMockTest {

    @Mock
    private ProductDAO productDAO;
    private ProductService productService;
   // private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
       // autoCloseable = MockitoAnnotations.openMocks(this);
        productService = new ProductService();
        productService.setProductDAO(productDAO);
    }

//    @AfterEach
//    void tearDown() throws Exception {
//        autoCloseable.close();
//    }

    @Test
    void getProducts() {
        productService.getProducts();
        verify(productDAO).findAll();
    }

    @Test
    void addProduct() {
        //given
        Product product= new Product("product3",4.5);
        //when
        productService.addProduct(product);
        //then
        ArgumentCaptor<Product> productArgumentCaptor= ArgumentCaptor.forClass(Product.class);
        verify(productDAO).save(productArgumentCaptor.capture());
        Product capturedProduct = productArgumentCaptor.getValue();
        assertThat(capturedProduct).isEqualTo(product);

    }
}