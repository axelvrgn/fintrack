package com.axelv.fintrack.application.service;

import com.axelv.fintrack.domain.model.Account;
import com.axelv.fintrack.domain.model.enums.AccountType;
import com.axelv.fintrack.domain.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(String name, AccountType type) {
        Account account = Account.create(name, type);
        return accountRepository.save(account);
    }
}
