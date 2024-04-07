package com.zee.repository;


import com.zee.model.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CartRepositoryImpl implements CartRepository {

    public boolean addCartDatabase(Product product, int quantity) {
        System.out.println(product.getName() + " is added to database");
        return true;
    }
}
