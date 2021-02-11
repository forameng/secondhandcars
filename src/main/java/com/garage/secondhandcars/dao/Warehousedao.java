package com.garage.secondhandcars.dao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="warehouse")
public class Warehousedao {
	@Id
    @GeneratedValue
	private int warehouse_id;
	@Column(name="name") 
	private String name;
	@Column(name="location_lat")  
	private String locationLat;
	@Column(name="location_long")  
	private String locationLong;
	@Column(name="car_location") 
	private String carLocation;
	@Column(name="car_id")  
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
	
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocationLat() {
		return locationLat;
	}
	public void setLocationLat(String locationLat) {
		this.locationLat = locationLat;
	}
	public String getLocationLong() {
		return locationLong;
	}
	public void setLocationLong(String locationLong) {
		this.locationLong = locationLong;
	}
	public String getCarLocation() {
		return carLocation;
	}
	public void setCarLocation(String carLocation) {
		this.carLocation = carLocation;
	}
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
	       append(" name "+ name).
	       append(" locationLat "+ locationLat).
	       append(" location_long "+ locationLong).
	       append(" location_long "+ locationLong).
	       	       
	       toString(); 
	}
	

}
