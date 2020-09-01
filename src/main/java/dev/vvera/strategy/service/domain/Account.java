package dev.vvera.strategy.service.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Account extends Product {

    private String number;
    private String bank;
    private String owner;

    @Builder
    public Account(String key, String number, String bank, String owner) {
        super(key);
        this.number = number;
        this.bank = bank;
        this.owner = owner;
    }
}
