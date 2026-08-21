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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }
}
