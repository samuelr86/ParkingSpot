package com.api.parkingcontrol.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;

	/**
	 * MÉTODO QUE SALVA OS DADOS DO MODEL NO BANCO DE DADOS
	 * @param parkingSpotModel
	 * @return
	 */
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}

	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		parkingSpotRepository.delete(parkingSpotModel);
		
	}
	
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
		
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartmentAndBlock(String apartment, String block) {
		return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}

	public Page<ParkingSpotModel> findAll(Pageable pageable) {
		return parkingSpotRepository.findAll(pageable);
	}

	public Optional<ParkingSpotModel> findById(UUID id) {
		return parkingSpotRepository.findById(id);
	}



	
}
