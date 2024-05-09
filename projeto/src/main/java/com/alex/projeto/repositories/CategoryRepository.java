package com.alex.projeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{
	
}
