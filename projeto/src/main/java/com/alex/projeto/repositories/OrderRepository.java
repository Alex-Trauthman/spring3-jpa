package com.alex.projeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
}
