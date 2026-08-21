package com.axelv.fintrack.infrastructure.web.dto.request;

import com.axelv.fintrack.domain.model.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateAccountRequest {

    @NotBlank
    private String name;
    @NotNull
    private AccountType type;

    public CreateAccountRequest() {}

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
}
