package com.garage.secondhandcars.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garage.secondhandcars.dto.Warehouse;

@Service
public class GarageService {
	
	public List<Warehouse> getWarehouseDetails()
	{
		
		System.out.println("In service");
		return new ArrayList<Warehouse>();
	}

}
