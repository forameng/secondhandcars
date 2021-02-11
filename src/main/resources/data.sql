

INSERT INTO warehouse (name,location_lat,location_long,car_location,car_id,car_make,car_model,car_year,car_price,licensed,car_date_added) 
VALUES
  ('Warehouse A','47.13111','-61.54801','West wing',1,'Volkswagen','Jetta III',1995,12947.52,true,'2018-09-18');


INSERT INTO warehouse (name,location_lat,location_long,car_location,car_id,car_make,car_model,car_year,car_price,licensed,car_date_added) 
VALUES
  ('Warehouse A','47.13111','-61.54801','West wing',2,'Chevrolet','Corvette',2004,20019.64,true,'2018-01-27');


INSERT INTO warehouse (name,location_lat,location_long,car_location,car_id,car_make,car_model,car_year,car_price,licensed,car_date_added) 
VALUES
  ('Warehouse A','47.13111','-61.54801','West wing',3,'Ford','Expedition EL',2008,27323.42,false,'2018-07-03');

--CREATE TABLE warehouse (
 -- id INT AUTO_INCREMENT  PRIMARY KEY,
  --name VARCHAR(250) NOT NULL,
 -- location VARCHAR(250) NOT NULL,
  --FOREIGN KEY (car_id) REFERENCES cars(cid)
--);

