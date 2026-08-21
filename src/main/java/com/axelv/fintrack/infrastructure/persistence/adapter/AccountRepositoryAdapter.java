package com.axelv.fintrack.infrastructure.persistence.adapter;

import com.axelv.fintrack.domain.model.Account;
import com.axelv.fintrack.domain.repository.AccountRepository;
import com.axelv.fintrack.infrastructure.persistence.entity.AccountJpaEntity;
import com.axelv.fintrack.infrastructure.persistence.mapper.AccountPersistenceMapper;
import com.axelv.fintrack.infrastructure.persistence.repository.AccountJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryAdapter implements AccountRepository {

    private final AccountJpaRepository jpaRepository;
    private final AccountPersistenceMapper mapper;


    public AccountRepositoryAdapter(AccountJpaRepository jpaRepository, AccountPersistenceMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    public Account save(Account account) {
        AccountJpaEntity accountJpaEntity = mapper.toJpaEntity(account);

        AccountJpaEntity savedEntity = jpaRepository.save(accountJpaEntity);

        return mapper.toDomain(savedEntity);
    }
}
