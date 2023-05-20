package com.jawad.ResturantManagementServiceApp.repository;

import com.jawad.ResturantManagementServiceApp.model.Food;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepository extends ListCrudRepository<Food, Long> {
}
