package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.AdminEn;
import com.hotel.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController 
{
	@Autowired
	AdminService aSer;
	
	@PostMapping("/")
	public void addDataA(@RequestBody AdminEn ad)
	{
		this.aSer.addData(ad);
	}
	
	@GetMapping("/")
	public List<AdminEn> getAllA()
	{
		List<AdminEn> li=this.aSer.getAll();
		return li;
	}
	
	@PutMapping("/{id}")
	public AdminEn updateA(@RequestBody AdminEn ad,@PathVariable long id)
	{
		return this.aSer.updateData(ad, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteByA(@PathVariable long id)
	{
		this.aSer.deleteByI(id);
	}
}
