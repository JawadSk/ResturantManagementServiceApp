package com.jawad.ResturantManagementServiceApp.service;

import com.jawad.ResturantManagementServiceApp.model.AdminAuthenticationToken;
import com.jawad.ResturantManagementServiceApp.repository.IAdminAuthenticationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthenticationTokenService {

    @Autowired
    private IAdminAuthenticationTokenRepository authenticationTokenRepository;

    public void saveToken(AdminAuthenticationToken token) {
        authenticationTokenRepository.save(token);
    }

    public String deleteToken(String token) {
        AdminAuthenticationToken adminToken = authenticationTokenRepository.findByToken(token);
        if (adminToken == null){
            return "Invalid token!";
        }

        authenticationTokenRepository.delete(adminToken);
        return "Signed out";
    }

    public boolean authenticateToken(String token) {
        return authenticationTokenRepository.existsByToken(token);
    }

    public AdminAuthenticationToken getAuthToken(String token) {
        return authenticationTokenRepository.findByToken(token);
    }
}
