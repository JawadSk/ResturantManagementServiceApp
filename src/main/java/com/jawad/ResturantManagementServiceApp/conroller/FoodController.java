package com.jawad.ResturantManagementServiceApp.conroller;

import com.jawad.ResturantManagementServiceApp.dtos.FoodInput;
import com.jawad.ResturantManagementServiceApp.service.FoodService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping("{token}")
    public String addFood(@PathVariable String token, @Valid @RequestBody FoodInput foodInput){
        return foodService.addFood(token, foodInput);
    }

    @DeleteMapping("{id}/{token}")
    public String deleteFood(@PathVariable String token,@PathVariable Long id){
        return foodService.deleteFood(token, id);
    }
}
