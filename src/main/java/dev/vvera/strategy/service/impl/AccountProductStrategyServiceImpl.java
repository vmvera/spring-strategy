package dev.vvera.strategy.service.impl;

import dev.vvera.strategy.service.ProductStrategyService;
import dev.vvera.strategy.service.domain.Account;
import dev.vvera.strategy.service.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class AccountProductStrategyServiceImpl implements ProductStrategyService {

    @Override
    public Product getProduct(String key) {
        return Account.builder()
                .bank("Bank 1")
                .key("2")
                .number("112233")
                .owner("Owner")
                .build();
    }

    @Override
    public String type() {
        return "Account";
    }


}
