package com.corebankingservice.repository;

import com.corebankingservice.model.UtilityAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilityAccountRepository extends JpaRepository<UtilityAccountEntity, Integer> {

    // Method to find a utility account by its account number
    Optional<UtilityAccountEntity> findByProviderName(String providerName);

}
