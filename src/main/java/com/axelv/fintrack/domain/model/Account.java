package com.axelv.fintrack.domain.model;

import com.axelv.fintrack.domain.model.enums.AccountType;

import java.time.LocalDateTime;

public class Account {

    private Long id;
    private String name;
    private AccountType type;
    private Money balance;
    private LocalDateTime createdAt;

}
