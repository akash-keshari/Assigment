package com.hotel.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Administrator")
public class AdminEn
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminId;
	
	
	private String name;
	
	private String hotelName;
	
	
	@OneToMany(targetEntity=Staff.class,cascade=CascadeType.ALL)
	@JoinColumn(name="admin_staff", referencedColumnName="adminId")
	private List<Staff> staff;


	public AdminEn() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdminEn(long adminId, String name, String hotelName, List<Staff> staff) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.hotelName = hotelName;
		this.staff = staff;
	}


	public long getAdminId() {
		return adminId;
	}


	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public List<Staff> getStaff() {
		return staff;
	}


	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	
	

}
