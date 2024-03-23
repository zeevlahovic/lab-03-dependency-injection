package com.zee.service;

import com.zee.model.Cart;
import com.zee.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface CartService {

    Cart addCart(Product product, int quantity);
}
