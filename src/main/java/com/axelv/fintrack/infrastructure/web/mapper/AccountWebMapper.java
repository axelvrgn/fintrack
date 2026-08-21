package com.axelv.fintrack.infrastructure.web.mapper;

import com.axelv.fintrack.domain.model.Account;
import com.axelv.fintrack.infrastructure.web.dto.response.AccountResponse;
import org.springframework.stereotype.Component;

@Component
public class AccountWebMapper {

    public AccountResponse toResponse(Account account) {

        return new AccountResponse(
                account.getId(),
                account.getName(),
                account.getType(),
                account.getBalance().getValue(),
                account.getBalance().getCurrency(),
                account.getCreatedAt()
        );
    }
}
