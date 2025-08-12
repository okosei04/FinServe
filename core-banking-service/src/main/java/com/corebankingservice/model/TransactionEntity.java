package com.corebankingservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
@Table
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private String referenceNumber;

    private String transactionId;

    @OneToOne
    @JoinColumn(name = "bank_account_id", referencedColumnName = "id")
    private BankAccountEntity bankAccount;


}
