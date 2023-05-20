package com.jawad.ResturantManagementServiceApp.repository;

import com.jawad.ResturantManagementServiceApp.model.Admin;
import org.springframework.data.repository.ListCrudRepository;

public interface IAdminRepository extends ListCrudRepository<Admin, Long> {
        boolean existsByEmail(String email);

        Admin findByEmail(String email);
}
