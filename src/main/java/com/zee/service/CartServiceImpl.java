package com.zee.service;

import com.zee.model.Cart;
import com.zee.model.Product;
import com.zee.repository.CartRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
@Component
@AllArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final StockService service;



    public Cart addCart(Product product, int quantity) {

        if (!service.checkStockIsAvailable(product, quantity)) return null;

        Cart cart = new Cart();

        cartRepository.addCartDatabase(product, quantity);

        BigDecimal totalAmount = product.getPrice().multiply(new BigDecimal(quantity));

        Map<Product, Integer> products = new HashMap<>();

        products.put(product, quantity);

        cart.setCartTotalAmount(totalAmount);
        cart.setProductMap(products);

        return cart;

    }
}
