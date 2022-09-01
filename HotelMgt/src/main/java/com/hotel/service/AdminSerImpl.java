package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entities.AdminEn;
import com.hotel.repositories.AdminRepository;

@Service
public class AdminSerImpl implements AdminService
{

	@Autowired
	AdminRepository aRepo;
	
	@Override
	public void addData(AdminEn adm) 
	{
		this.aRepo.save(adm);		
	}

	@Override
	public void deleteByI(Long id) 
	{
		this.aRepo.deleteById(id);
	}

	@Override
	public AdminEn updateData(AdminEn adm, Long id) 
	{
		adm.setAdminId(id);
		return this.aRepo.save(adm);
	}

	@Override
	public List<AdminEn> getAll() 
	{
		List<AdminEn> li=this.aRepo.findAll();
		return li;
	}

}
