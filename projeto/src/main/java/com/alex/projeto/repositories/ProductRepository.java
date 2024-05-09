package com.alex.projeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	
}
