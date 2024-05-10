package com.alex.projeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.projeto.entities.OrderItem;
import com.alex.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{
	
}
