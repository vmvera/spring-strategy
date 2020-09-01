package dev.vvera.strategy.service;

import dev.vvera.strategy.service.domain.Product;

public interface ProductStrategyService {

    Product getProduct(String key);
    String type();

}
