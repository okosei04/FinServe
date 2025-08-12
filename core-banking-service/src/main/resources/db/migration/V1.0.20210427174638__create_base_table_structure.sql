-- banking_core_service.banking_core_user definition

CREATE TABLE banking_core_user (
                                   id BIGSERIAL PRIMARY KEY,
                                   email VARCHAR(255),
                                   first_name VARCHAR(255),
                                   identification_number VARCHAR(255),
                                   last_name VARCHAR(255)
);

-- banking_core_service.banking_core_account definition

CREATE TABLE banking_core_account (
                                      id BIGSERIAL PRIMARY KEY,
                                      actual_balance NUMERIC(19, 2),
                                      available_balance NUMERIC(19, 2),
                                      number VARCHAR(255),
                                      status VARCHAR(255),
                                      type VARCHAR(255),
                                      user_id BIGINT,
                                      CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES banking_core_user(id)
);

-- banking_core_service.banking_core_utility_account definition

CREATE TABLE banking_core_utility_account (
                                              id BIGSERIAL PRIMARY KEY,
                                              number VARCHAR(255),
                                              provider_name VARCHAR(255)
);
