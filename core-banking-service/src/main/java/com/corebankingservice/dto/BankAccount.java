package com.corebankingservice.dto;

import lombok.Data;

@Data
public class BankAccount {
    private Long id;
    private String accountNumber;
    private String accountType;
    private String availableBalance;
    private String actualBalance;
    private User user;

}
