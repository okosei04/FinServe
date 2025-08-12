package com.corebankingservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String identityNumber;
    private Long id;
    private List<BankAccount> bankAccounts;
}
