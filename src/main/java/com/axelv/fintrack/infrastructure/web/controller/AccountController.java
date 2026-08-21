package com.axelv.fintrack.infrastructure.web.controller;

import com.axelv.fintrack.application.service.AccountService;
import com.axelv.fintrack.domain.model.Account;
import com.axelv.fintrack.infrastructure.web.dto.request.CreateAccountRequest;
import com.axelv.fintrack.infrastructure.web.dto.response.AccountResponse;
import com.axelv.fintrack.infrastructure.web.mapper.AccountWebMapper;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;
    private final AccountWebMapper accountWebMapper;


    public AccountController(AccountService accountService, AccountWebMapper accountWebMapper) {
        this.accountService = accountService;
        this.accountWebMapper = accountWebMapper;
    }

    @PostMapping
    ResponseEntity<AccountResponse> createAccount(@Valid @RequestBody CreateAccountRequest createAccountRequest) {

        Account createdAccount = accountService.createAccount(createAccountRequest.getName(), createAccountRequest.getType());
        AccountResponse accountResponse = accountWebMapper.toResponse(createdAccount);

        return ResponseEntity.status(201).body(accountResponse);
    }
}
