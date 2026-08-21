package com.axelv.fintrack.infrastructure.web.dto.response;

import com.axelv.fintrack.domain.model.enums.AccountType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AccountResponse {

    private Long id;
    private String name;
    private AccountType type;
    private BigDecimal balance;
    private String currency;
    private LocalDateTime createdAt;

    public AccountResponse(Long id, String name, AccountType type, BigDecimal balance, String currency, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.currency = currency;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AccountType getType() {
        return type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
