package com.corebankingservice.repository;

import com.corebankingservice.model.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

//    Optional<TransactionEntity> findByTransactionId(String transactionId);
}
