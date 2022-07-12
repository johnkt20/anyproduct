package com.yohannes.anyproduct.controller;

import com.yohannes.anyproduct.AnyproductApplication;
import com.yohannes.anyproduct.configuration.ProductList;
import com.yohannes.anyproduct.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.core.TypeReferences;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = AnyproductApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@DirtiesContext
public class ProductControllerTest {

 @Autowired
  private RestTemplate restTemplate;
 @Autowired
 private ProductController productController;
 private String URL;
 @LocalServerPort
 private int port;
 private String URL2;
 private static final String root = "http://localhost:8080/store/products";


    @BeforeEach
    void setUp() {
        URL= "http:localhost:"+ port + "products";
        URL2="http//:localhost:8080/products";

    }

//    @Test
//    @Disabled
//    void addProduct() {
//    }

    @Test
    void getAllProducts() throws Exception {
//        assertTrue(
//                this.restTemplate
//                        .getForObject("http://localhost:" + port + "/store/products", ProductList.class)
//                        .getProductList().size()== 4);
//        final ResponseEntity<EntityModel<Product>> productResponse=
//                restTemplate.exchange("http://localhost:" + port + "/store/products",HttpMethod.GET
//                ,null,new TypeReferences.EntityModelType<List<Product>>(){});
//        assertNotNull(productResponse.getBody().getContent());
//        ProductList response = restTemplate.getForObject(
//                "http://localhost:" + port + "/store/products",
//                ProductList.class);
//        List<Product> employees = response.getProductList();

        ResponseEntity<Product[]> response =
                restTemplate.getForEntity(
                        "http://localhost:" + port + "/store/products",
                        Product[].class);
        Product[] products = response.getBody();
        assertEquals(products.length,0);

        }


}