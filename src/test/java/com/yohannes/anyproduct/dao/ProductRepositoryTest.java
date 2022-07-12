package com.yohannes.anyproduct.dao;

import com.yohannes.anyproduct.domain.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // this will connect the dependencies and load database for testing
class ProductRepositoryTest {
    @Autowired
    private ProductDAO productDAO;

    @AfterEach
    void tearDown() {
        productDAO.deleteAll();
    }

    @Test
    void CheckIfProductNameExist() {
     Product product= new Product("product01",3.4); //given
        String productName="";
        productDAO.save(product);
       Iterator<Product> productList= productDAO.findAll().iterator(); //When

        while(productList.hasNext()){
            Product product1=productList.next();
            if(product1.getName().equalsIgnoreCase(product.getName())){
                productName=product.getName();
                break;
            }
        }
     assertEquals(productName,product.getName());
    }
//    @Test
//    void getProductByName(){
//        Product product= new Product("product2",4.5);
//        productDAO.save(product);
//       String result= productDAO.getProductByName("product2").getName();
//       assertEquals(product.getName(),result);
//    }

}