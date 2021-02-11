package com.garage.secondhandcars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.garage.secondhandcars.dto.Warehouse;
import com.garage.secondhandcars.service.GarageService;

@RestController
public class GarageController {
	
	@Autowired
	private  GarageService garageService;
	
	
	@GetMapping("/warehouse")
	 public ResponseEntity<List<Warehouse>> getWarehouseDetails(){
		System.out.println("In Controller");
		ResponseEntity<List<Warehouse>> responseEntity;
		List<Warehouse> warehouseList=garageService.getWarehouseDetails();
		responseEntity=new ResponseEntity<>(warehouseList,HttpStatus.OK);
		return responseEntity;
	}
	
	

}
