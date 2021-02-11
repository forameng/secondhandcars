package com.garage.secondhandcars.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.secondhandcars.dao.Warehousedao;
import com.garage.secondhandcars.dto.Cars;
import com.garage.secondhandcars.dto.Location;
import com.garage.secondhandcars.dto.Vehicles;
import com.garage.secondhandcars.dto.Warehouse;
import com.garage.secondhandcars.repository.WarehouseRepository;

@Service
public class GarageService {
	@Autowired
    WarehouseRepository repository;
	
	public List<Warehouse> getWarehouseDetails()
	{	
		System.out.println("In service");
		List<Warehouse> warehouseList=new ArrayList<Warehouse>();
		List<Warehousedao> warehousedaoList=getAll();
		warehousedaoList=sortOnDateAdded(warehousedaoList);
		System.out.println("In service retriveed Sorted list "+Objects.toString(warehousedaoList));
			for(Warehousedao warehousedao:warehousedaoList)
				{	
					Warehouse warehouse=convertDAOtoDTO(warehousedao);
					warehouseList.add(warehouse);
				}
			
		return warehouseList;
	}
	
	// Get all cars from the h2 warehouse database.
    private List<Warehousedao> getAll() {
        final List<Warehousedao> warehouseDaoList = new ArrayList<>();
        repository.findAll().forEach(warehousedao -> warehouseDaoList.add(warehousedao));
        System.out.println(warehouseDaoList);
        return warehouseDaoList;
    }
    
    private Warehouse convertDAOtoDTO(Warehousedao dao){
    	Warehouse warehouse=new Warehouse();
    	
    	warehouse.setWid(String.valueOf(dao.getWarehouse_id()));
    	warehouse.setName(dao.getName());
    	
    	Location location=new Location();
    	location.setLatitude(dao.getLocationLat());
    	location.setLongitude(dao.getLocationLong());
    	warehouse.setLocation(location);
    	
    	Cars cars=new Cars();
    	cars.setLocation(dao.getCarLocation());
    	List <Vehicles> VehicleLst=new ArrayList<Vehicles>();
    	Vehicles vehicle=new Vehicles();
    	vehicle.setVid(dao.getCarId());
    	vehicle.setYearModel(dao.getCarYear());
    	vehicle.setDateAdded(dao.getCarDateAdded());
    	vehicle.setLicensed(dao.isLicensed());
    	vehicle.setMake(dao.getCarMake());
    	vehicle.setModel(dao.getCarModel());
    	vehicle.setPrice(dao.getCarPrice());
    	VehicleLst.add(vehicle);
    	
    	cars.setVehicles(VehicleLst);
    	
    	warehouse.setCars(cars);
    	
    	return warehouse;
    }
    private List<Warehousedao> sortOnDateAdded(List<Warehousedao> warehouseList){
    	warehouseList.sort(Comparator.comparing(Warehousedao::getCarDateAdded));
    	return warehouseList;
    }
    

}
