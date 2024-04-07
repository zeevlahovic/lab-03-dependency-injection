package com.zee.service;

import com.zee.model.Product;
import org.springframework.stereotype.Component;


public interface StockService {

    boolean checkStockIsAvailable(Product product, int quantity);
}
