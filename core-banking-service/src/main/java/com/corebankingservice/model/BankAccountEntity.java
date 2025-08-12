package com.corebankingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name="bank_account_core")
@Entity
@Getter
@Setter
public class BankAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    private BigDecimal balance;

    private BigDecimal accountBalance;

    @ManyToOne()
    @JoinColumn(name="user_id")
    private UserEntity user;
}
