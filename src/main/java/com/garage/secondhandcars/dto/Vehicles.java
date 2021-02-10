package com.garage.secondhandcars.dto;

public class Vehicles {
	private int vid;
	private String make;
	private String model;
	private int yearModel;
	private double price;
	private boolean licensed;
	private String dateAdded;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isLicensed() {
		return licensed;
	}
	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	
	

}
