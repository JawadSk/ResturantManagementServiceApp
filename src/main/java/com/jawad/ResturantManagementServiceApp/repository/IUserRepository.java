package com.jawad.ResturantManagementServiceApp.repository;

import com.jawad.ResturantManagementServiceApp.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends ListCrudRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
