-- Migration Flyway V1 : création de la table accounts
-- Correspond à l'entité AccountJpaEntity
-- (le Value Object Money du domaine est "éclaté" en deux colonnes : balance_value / balance_currency)

CREATE TABLE accounts (
                          id                BIGSERIAL PRIMARY KEY,
                          name              VARCHAR(255)   NOT NULL,
                          type              VARCHAR(20)    NOT NULL,
                          balance_value     NUMERIC(19, 2) NOT NULL,
                          balance_currency  VARCHAR(3)     NOT NULL,
                          created_at        TIMESTAMP      NOT NULL
);