package com.jawad.ResturantManagementServiceApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInOutPut {

    private String status;
    private String token;
}
