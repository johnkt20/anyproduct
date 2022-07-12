package com.yohannes.anyproduct.service;

import com.yohannes.anyproduct.controller.ProductController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
/* This starts Application context that can support only Integration test,
It doesnot load all spring sercices
- diffblue is an intellij plugin for generting unittest and integation test
- AI for code from diffblue
*/

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
@DataJpaTest
class ProductServiceIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    void getProducts() throws Exception {
        RequestBuilder requestBuilder= MockMvcRequestBuilders.get("/products");
        MvcResult result= mockMvc.perform(requestBuilder).andReturn();
        assertEquals("test",result.getResponse().getContentAsString());
    }

    @Test
    void addProduct() {
    }
}