package com.training.OnlineFoodDeliveryApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="RESTAURANTS")
public class Restaurant {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int RestaurantId;
	private String RestaurantName;
	private String Address;
	private String ManagerName;
	private Double ContactNum;
	
	public Restaurant() {
		
	}
	public Restaurant(int restaurantId, String restaurantName, String address, String managerName, Double contactNum) {
		super();
		this.RestaurantId = restaurantId;
		this.RestaurantName = restaurantName;
		this.Address = address;
		this.ManagerName = managerName;
		this.ContactNum = contactNum;
	}
	
	public int getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		RestaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public Double getContactNum() {
		return ContactNum;
	}
	public void setContactNum(Double contactNum) {
		ContactNum = contactNum;
	}
	

}
