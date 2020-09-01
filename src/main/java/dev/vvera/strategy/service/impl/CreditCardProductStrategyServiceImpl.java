package dev.vvera.strategy.service.impl;

import dev.vvera.strategy.service.ProductStrategyService;
import dev.vvera.strategy.service.domain.CreditCard;
import dev.vvera.strategy.service.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class CreditCardProductStrategyServiceImpl implements ProductStrategyService {

    @Override
    public Product getProduct(String key) {
        return CreditCard.builder()
                .cardHolderName("User Name")
                .issuer("VISA")
                .key(key)
                .number("11112222XXXX")
                .build();
    }

    @Override
    public String type() {
        return "CreditCard";
    }

}
