package com.jawad.ResturantManagementServiceApp.repository;

import com.jawad.ResturantManagementServiceApp.model.Order;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends ListCrudRepository<Order, Long> {


}
