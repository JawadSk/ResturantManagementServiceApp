package com.jawad.ResturantManagementServiceApp.service;

import com.jawad.ResturantManagementServiceApp.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    @Autowired
    private FoodService foodService;

    public List<Food> getAllFoods() {
        return foodService.getFoods();
    }
}
