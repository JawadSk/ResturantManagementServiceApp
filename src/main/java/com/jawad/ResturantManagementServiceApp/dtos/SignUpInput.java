package com.jawad.ResturantManagementServiceApp.dtos;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpInput {

    private String name;
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@admin\\.com$", message = "Not a valid Admin email")
    private String email;
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d\\S]{8,20}$", message = "Not a strong password")
    private String password;
    private String address;
}
