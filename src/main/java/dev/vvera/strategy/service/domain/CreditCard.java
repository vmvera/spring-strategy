package dev.vvera.strategy.service.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CreditCard extends Product {
    private String number;
    private String issuer;
    private String cardHolderName;

    @Builder
    public CreditCard(String key, String number, String issuer, String cardHolderName) {
        super(key);
        this.number = number;
        this.issuer = issuer;
        this.cardHolderName = cardHolderName;
    }

}
