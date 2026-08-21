package com.axelv.fintrack.domain.repository;

import com.axelv.fintrack.domain.model.Account;

public interface AccountRepository {

    Account save(Account account);
}
