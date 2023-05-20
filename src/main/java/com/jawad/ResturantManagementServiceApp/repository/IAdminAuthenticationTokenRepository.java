package com.jawad.ResturantManagementServiceApp.repository;

import com.jawad.ResturantManagementServiceApp.model.AdminAuthenticationToken;
import org.springframework.data.repository.ListCrudRepository;

public interface IAdminAuthenticationTokenRepository extends ListCrudRepository<AdminAuthenticationToken, Long> {
    AdminAuthenticationToken findByToken(String token);

    boolean existsByToken(String token);

}
