package com.jawad.ResturantManagementServiceApp.conroller;

import com.jawad.ResturantManagementServiceApp.model.Food;
import com.jawad.ResturantManagementServiceApp.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("visitor")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @GetMapping()
    public List<Food> getAllFoods(){
        return visitorService.getAllFoods();
    }
}
