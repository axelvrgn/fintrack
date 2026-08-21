package com.axelv.fintrack.infrastructure.persistence.mapper;

import com.axelv.fintrack.domain.model.Account;
import com.axelv.fintrack.domain.model.Money;
import com.axelv.fintrack.infrastructure.persistence.entity.AccountJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountPersistenceMapper {

    public AccountJpaEntity toJpaEntity(Account account) {

        return new AccountJpaEntity(
                account.getId(),
                account.getName(),
                account.getType(),
                account.getBalance().getValue(),
                account.getBalance().getCurrency(),
                account.getCreatedAt()
        );
    }

    public Account toDomain(AccountJpaEntity entity) {

        Money balance = Money.of(entity.getBalanceValue(), entity.getBalanceCurrency());

        return new Account(
                entity.getId(),
                entity.getName(),
                entity.getType(),
                balance,
                entity.getCreatedAt()
        );
    }
}
