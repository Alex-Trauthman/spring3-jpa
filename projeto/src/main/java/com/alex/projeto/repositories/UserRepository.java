package com.alex.projeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.projeto.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}
