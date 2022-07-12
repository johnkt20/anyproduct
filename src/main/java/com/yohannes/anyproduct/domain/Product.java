package com.yohannes.anyproduct.domain;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {
   @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;

    public Product() {
    }

   public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
}
