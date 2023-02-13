package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

import jakarta.persistence.Id;

/**
 * INTERFACE RESPONSAVEL PELA PERSISTENCIA DO BANCO DE DADOS
 * @author samuel 
 *
 */
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	boolean existsByLicensePlateCar(String licensePlateCar);
	
	boolean existsByParkingSpotNumber(String parkingSpotNumber);
	
	boolean existsByApartmentAndBlock(String apartment, String block);
	
	
}
