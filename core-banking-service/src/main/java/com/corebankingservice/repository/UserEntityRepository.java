package com.corebankingservice.repository;

import com.corebankingservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find a user by username:
     Optional<UserEntity> findByIdentityNumber(String identityNumber);

    // Or to find a user by email:
    // Optional<UserEntity> findByEmail(String email);
}
