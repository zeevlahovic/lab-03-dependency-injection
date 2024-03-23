package com.zee;

import com.zee.config.ConfigApp;
import com.zee.model.Cart;
import com.zee.model.Product;
import com.zee.repository.CartRepository;
import com.zee.service.CartServiceImpl;
import com.zee.service.StockService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith( SpringRunner.class )
@ContextConfiguration(classes = ConfigApp.class)
public class CartServiceTest {

    @Autowired
    private CartServiceImpl cartService;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private StockService stockService;


    @Test
    public void addCartTest(){
        Product product = new Product();
        product.setName("milk");
        product.setPrice(new BigDecimal(12));
        product.setQuantity(3);
        product.setRemainingQuantity(3);
        Cart cart = cartService.addCart(product, 2);
        Assert.assertEquals(new BigDecimal(24), cart.getCartTotalAmount());
    }
}
