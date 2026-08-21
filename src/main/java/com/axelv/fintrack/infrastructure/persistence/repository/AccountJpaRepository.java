package com.axelv.fintrack.infrastructure.persistence.repository;

import com.axelv.fintrack.infrastructure.persistence.entity.AccountJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<AccountJpaEntity, Long> {
}
