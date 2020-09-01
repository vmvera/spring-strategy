package dev.vvera.strategy.controller;

import dev.vvera.strategy.service.ProductStrategyFactory;
import dev.vvera.strategy.service.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductController {

    private final ProductStrategyFactory productStrategyFactory;

    @GetMapping("/{productType}/{key}")
    public Product getProduct(@PathVariable String productType, @PathVariable String key) {
        return productStrategyFactory.getStrategy(productType).getProduct(key);
    }


}
