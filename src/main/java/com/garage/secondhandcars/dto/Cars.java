package com.garage.secondhandcars.dto;

import java.util.List;

public class Cars {
	
	private String location;
	private List<Vehicles> vehicles;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Vehicles> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicles> vehicles) {
		this.vehicles = vehicles;
	}
	

}
