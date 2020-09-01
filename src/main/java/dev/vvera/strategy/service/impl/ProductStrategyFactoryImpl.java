package dev.vvera.strategy.service.impl;

import dev.vvera.strategy.service.ProductStrategyFactory;
import dev.vvera.strategy.service.ProductStrategyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductStrategyFactoryImpl implements ProductStrategyFactory {

    private final Map<String, ProductStrategyService> productsStrategyService;

    @Override
    public ProductStrategyService getStrategy(String key) {
        return productsStrategyService.get(key);
    }

    public ProductStrategyFactoryImpl(List<ProductStrategyService> productsStrategyService) {
        this.productsStrategyService = createMap(productsStrategyService);
    }

    private Map<String, ProductStrategyService> createMap(List<ProductStrategyService> productsStrategyService) {
        return productsStrategyService.stream().collect(
                Collectors.toMap(ProductStrategyService::type, x -> x));
    }

}
