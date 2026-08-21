package com.axelv.fintrack.domain.model;

import com.axelv.fintrack.domain.model.enums.TransactionType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {

    private Long id;
    private Account account;
    private Category category;
    private TransactionType type;
    private Money amount;
    private String label;
    private LocalDate date;
    private LocalDateTime createdAt;
}
