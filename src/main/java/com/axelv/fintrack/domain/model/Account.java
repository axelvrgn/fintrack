package com.axelv.fintrack.domain.model;

import com.axelv.fintrack.domain.model.enums.AccountType;

import java.time.LocalDateTime;

public class Account {

    private static final String DEFAULT_CURRENCY = "EUR";

    private Long id;
    private String name;
    private AccountType type;
    private Money balance;
    private LocalDateTime createdAt;


    public Account(Long id, String name, AccountType type, Money balance, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public static Account create(String name, AccountType type) {
        return new Account(null, name, type, Money.zero(DEFAULT_CURRENCY), LocalDateTime.now());
    }
}
