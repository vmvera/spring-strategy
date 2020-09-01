package dev.vvera.strategy.service;

public interface ProductStrategyFactory {
    ProductStrategyService getStrategy(String key);
}
