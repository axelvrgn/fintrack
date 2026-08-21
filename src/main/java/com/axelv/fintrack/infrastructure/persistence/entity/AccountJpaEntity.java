package com.axelv.fintrack.infrastructure.persistence.entity;

import com.axelv.fintrack.domain.model.enums.AccountType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class AccountJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private BigDecimal balanceValue;
    private String balanceCurrency;
    private LocalDateTime createdAt;

    protected AccountJpaEntity() {};

    public AccountJpaEntity(Long id, String name, AccountType type, BigDecimal balanceValue, String balanceCurrency, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balanceValue = balanceValue;
        this.balanceCurrency = balanceCurrency;
        this.createdAt = createdAt;
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

    public BigDecimal getBalanceValue() {
        return balanceValue;
    }

    public void setBalanceValue(BigDecimal balanceValue) {
        this.balanceValue = balanceValue;
    }

    public String getBalanceCurrency() {
        return balanceCurrency;
    }

    public void setBalanceCurrency(String balanceCurrency) {
        this.balanceCurrency = balanceCurrency;
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
}
