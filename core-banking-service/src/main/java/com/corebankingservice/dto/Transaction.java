package com.corebankingservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Transaction {

    private Long transactionId;
    private BigDecimal amount;
    private BankAccount bankAccount;
    private String referenceNumber;
}
