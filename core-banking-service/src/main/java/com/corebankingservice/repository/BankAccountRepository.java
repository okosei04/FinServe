package com.corebankingservice.repository;

import com.corebankingservice.model.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {

    // Custom query methods can be defined here if needed
    // For example, to find accounts by account number:
     Optional<BankAccountEntity> findByAccountNumber(String accountNumber);

    // Or to find accounts by customer ID:
    // List<BankAccountEntity> findByCustomerId(Long customerId);
}
