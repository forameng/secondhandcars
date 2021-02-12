package com.garage.secondhandcars.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.secondhandcars.dao.CartDao;
import com.garage.secondhandcars.dao.WarehouseDao;
import com.garage.secondhandcars.dto.Cars;
import com.garage.secondhandcars.dto.Location;
import com.garage.secondhandcars.dto.Vehicles;
import com.garage.secondhandcars.dto.Warehouse;
import com.garage.secondhandcars.repository.CartRepository;
import com.garage.secondhandcars.repository.WarehouseRepository;

@Service
public class GarageService {
	@Autowired
    WarehouseRepository warehouserepository;
	@Autowired
	CartRepository cartRepository;
	
	public List<Warehouse> getWarehouseDetails()
	{	
		System.out.println("In service");
		List<Warehouse> warehouseList=new ArrayList<Warehouse>();
		List<WarehouseDao> warehousedaoList=getAll();
		warehousedaoList=sortOnDateAdded(warehousedaoList);
		System.out.println("In service retriveed Sorted list "+Objects.toString(warehousedaoList));
			for(WarehouseDao warehousedao:warehousedaoList)
				{	
					Warehouse warehouse=convertDAOtoDTO(warehousedao);
					warehouseList.add(warehouse);
				}
			
		return warehouseList;
	}
	
	// Get all cars from the h2 warehouse database.
    private List<WarehouseDao> getAll() {
        final List<WarehouseDao> warehouseDaoList = new ArrayList<>();
        warehouserepository.findAll().forEach(warehousedao -> warehouseDaoList.add(warehousedao));
        System.out.println(warehouseDaoList);
        return warehouseDaoList;
    }
    
    private Warehouse convertDAOtoDTO(WarehouseDao dao){
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
    private List<WarehouseDao> sortOnDateAdded(List<WarehouseDao> warehouseList){
    	warehouseList.sort(Comparator.comparing(WarehouseDao::getCarDateAdded));
    	return warehouseList;
    }

	public List<Vehicles> getVehiclesFromCart(List<Vehicles> vehicleList) {
		List<CartDao> cartList= new ArrayList<CartDao>(); 
		for(Vehicles veh:vehicleList){
			CartDao cart=convertDTOtoDAO(veh);
			cartList.add(cart);
		}
		List<CartDao> savedCartList= new ArrayList<CartDao>();
		System.out.println("In service list to be saved  "+Objects.toString(cartList));
		savedCartList=getAllItems(cartList);
		List<Vehicles> finalVehicleLst= new ArrayList<Vehicles>();
		System.out.println("In service saved list "+Objects.toString(savedCartList));
		for(CartDao cart:savedCartList){
			Vehicles veh=convertDAOtoDTO(cart);
			finalVehicleLst.add(veh);
		}

		return finalVehicleLst;
	}
	
	private List<CartDao> getAllItems(List<CartDao> cartList) {
        final List<CartDao> cartDaoList = new ArrayList<>();
        cartRepository.saveAll(cartList).forEach(warehousedao -> cartDaoList.add(warehousedao));
        System.out.println(cartDaoList);
        return cartDaoList;
    }
    private CartDao convertDTOtoDAO(Vehicles vehicle)
    {
    	CartDao cartDao=new CartDao();
    	cartDao.setCarId(vehicle.getVid());
    	cartDao.setCarMake(vehicle.getMake());
    	cartDao.setCarModel(vehicle.getModel());
    	cartDao.setCarPrice(vehicle.getPrice());
    	cartDao.setCarYear(vehicle.getYearModel());
    	cartDao.setLicensed(vehicle.isLicensed());
    	cartDao.setCarDateAdded(vehicle.getDateAdded());
    	return cartDao;
    }
    
    private Vehicles convertDAOtoDTO(CartDao cartDao){
    	Vehicles vehicle=new Vehicles();
    	vehicle.setVid(cartDao.getCarId());
    	vehicle.setMake(cartDao.getCarMake());
    	vehicle.setModel(cartDao.getCarModel());
    	vehicle.setPrice(cartDao.getCarPrice());
    	vehicle.setYearModel(cartDao.getCarYear());
    	vehicle.setLicensed(cartDao.isLicensed());
    	vehicle.setDateAdded(cartDao.getCarDateAdded());
    	return vehicle;
    }

}
