package com.yohannes.anyproduct.service;

import com.yohannes.anyproduct.dao.ProductDAO;
import com.yohannes.anyproduct.domain.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class ProductService {

    @Autowired
    ProductDAO productDAO;



    public List<Product> getProducts(){
      return (List<Product>) productDAO.findAll();
    }

    public boolean addProduct(Product product){
        productDAO.save(product);
        return true;
    }
    // for the purpose of Unit test
    public List<Product> getProducts22(){
        List<Product> list= new ArrayList<>();
        Product product= new Product("test1",2.5);
        list.add(product);
        return list;
    }
}
