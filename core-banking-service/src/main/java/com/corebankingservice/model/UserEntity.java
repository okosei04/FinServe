package com.corebankingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="bank_user_core")
@Getter
@Setter
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    private String firstName;
    private String lastName;
    private String email;
    private String identityNumber;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BankAccountEntity> bankAccounts;

}
