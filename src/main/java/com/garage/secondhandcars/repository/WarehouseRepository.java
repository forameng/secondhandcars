package com.garage.secondhandcars.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.garage.secondhandcars.dao.Warehousedao;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehousedao, Integer> {

}
