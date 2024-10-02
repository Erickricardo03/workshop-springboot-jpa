package com.utility.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.utility.demo.entities.OrderItem;
import com.utility.demo.entities.PK.OrderItemPk;

public interface OrderItemRepository extends CrudRepository<OrderItem, OrderItemPk > {

}
