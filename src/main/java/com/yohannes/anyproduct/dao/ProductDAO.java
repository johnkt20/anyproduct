package com.yohannes.anyproduct.dao;

import com.yohannes.anyproduct.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends CrudRepository<Product,String> {
//     @Query("Select p.name from Product p  where p.name=pname")
//    public String getProductByName(String pname);
}
