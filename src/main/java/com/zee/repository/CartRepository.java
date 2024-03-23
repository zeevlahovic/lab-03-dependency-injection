package com.zee.repository;

import com.zee.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface CartRepository {

    boolean addCartDatabase(Product product, int quantity);
}
