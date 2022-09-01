package com.hotel.service;

import java.util.List;

import com.hotel.entities.AdminEn;

public interface AdminService
{
	void addData(AdminEn adm);
	
	void deleteByI(Long id);
	
	AdminEn updateData(AdminEn adm,Long id);
	
	List<AdminEn> getAll();
	
}
