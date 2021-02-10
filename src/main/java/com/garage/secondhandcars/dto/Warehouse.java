package com.garage.secondhandcars.dto;

public class Warehouse {
	private String wid;
	private String name;
	private Location location;
	private Cars cars;
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	
	

}
