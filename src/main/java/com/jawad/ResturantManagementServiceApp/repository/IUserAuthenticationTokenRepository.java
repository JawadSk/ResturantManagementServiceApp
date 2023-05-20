package com.jawad.ResturantManagementServiceApp.repository;

import com.jawad.ResturantManagementServiceApp.model.UserAuthenticationToken;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserAuthenticationTokenRepository extends ListCrudRepository<UserAuthenticationToken, Long> {
    UserAuthenticationToken findByToken(String token);
}
