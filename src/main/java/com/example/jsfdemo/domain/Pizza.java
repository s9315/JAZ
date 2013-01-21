package com.example.jsfdemo.domain;

import java.sql.Time;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Pizza {
	
	private String firstName = "unknown";
	private String pizzaName = "";
	private String phoneNumber = "";
	private String adres="";
	private String ingredients="";
	private String productname="";
	private Date dateToGet = new Date();
	
	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Size(min = 2, max = 20)
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	
	@Size(min = 6, max = 10)
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Size(min = 6, max = 30)
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	@Size(min = 6, max = 40)
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Size(min = 6, max = 40)
	public String getProductName() {
		return productname;
	}
	public void setProductName(String productname) {
		this.productname = productname;
	}
	
	@Past
	public Date getDateToGet() {
		return dateToGet;
	}
	public void setDateToGet(Date dateToGet) {
		this.dateToGet = dateToGet;
	}
}
