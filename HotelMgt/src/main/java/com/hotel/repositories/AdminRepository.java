package com.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.AdminEn;

public interface AdminRepository extends JpaRepository<AdminEn,Long> 
{
	
}
