package com.zee.service;

import com.zee.model.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StockServiceImpl implements StockService {

    @Override
    public boolean checkStockIsAvailable(Product product, int quantity) {
        return product.getRemainingQuantity() > quantity;
    }
}
