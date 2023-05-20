package com.jawad.ResturantManagementServiceApp.conroller;

import com.jawad.ResturantManagementServiceApp.dtos.SignInInput;
import com.jawad.ResturantManagementServiceApp.dtos.SignUpInputUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("signup")
    public String signupUser(@Valid @RequestBody SignUpInputUser inputUser){
        return userService.signupUser(inputUser);
    }

    @PostMapping("signin")
    public SignInOutput signinUser(@Valid @RequestBody SignInInput inputUser){
        return userService.signinUser(inputUser);
    }

    @DeleteMapping("signout/{token}")
    public String signoutUser(@PathVariable String token){
        return userService.signoutUser(token);
    }
}
