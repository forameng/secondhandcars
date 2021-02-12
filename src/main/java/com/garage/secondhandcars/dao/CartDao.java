package com.garage.secondhandcars.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cart")
public class CartDao {
	
	@Id 
	private int carId;
	@Column(name="car_make") 
	private String carMake;
	@Column(name="car_model")  
	private String carModel;
	@Column(name="car_year")  
	private int carYear;
	@Column(name="car_price")  
	private double carPrice;
	@Column(name="licensed")  
	private boolean licensed;
	@Column(name="car_date_added")  
	private String carDateAdded;
	

	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public boolean isLicensed() {
		return licensed;
	}
	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}
	public String getCarDateAdded() {
		return carDateAdded;
	}
	public void setCarDateAdded(String carDateAdded) {
		this.carDateAdded = carDateAdded;
	}
	
	@Override
	public String toString() {
	     return new StringBuilder().
	    append("\ncarId "+ carId).
		append(" carModel"+ carModel).
	     append(" car_date_added "+ carDateAdded).
	     append(" carPrice "+ carPrice).	       	       
	       toString(); 
	}

}
