package com.jawad.ResturantManagementServiceApp.conroller;

import com.jawad.ResturantManagementServiceApp.dtos.SignInInput;
import com.jawad.ResturantManagementServiceApp.dtos.SignUpInput;
import com.jawad.ResturantManagementServiceApp.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("signup")
    public String signup(@Valid @RequestBody SignUpInput signUpInput){
        return adminService.saveAdmin(signUpInput);
    }

    @PostMapping("signin")
    public SignInOutput signinAdmin(@RequestBody SignInInput signInInput){
        return adminService.signinAdmin(signInInput);
    }

    @DeleteMapping("signout/{token}")
    public String signoutAdmin(@PathVariable String token){
        return adminService.signoutAdmin(token);
    }
}
