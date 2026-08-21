package com.axelv.fintrack.domain.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {

    private static final int SCALE = 2;

    private BigDecimal value;
    private String currency;

    public Money(BigDecimal value, String currency) {
        if (value == null) {
            throw new IllegalArgumentException("Money value cannot be null");
        }
        if (currency == null || currency.isBlank()) {
            throw new IllegalArgumentException("Money currency cannot be null or blank");
        }
        this.value = value.setScale(SCALE, RoundingMode.HALF_UP);
        this.currency = currency;
    }

    public static Money zero(String currency) {
        return new Money(BigDecimal.ZERO, currency);
    }
}
