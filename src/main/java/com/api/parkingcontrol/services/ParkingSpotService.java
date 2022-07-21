package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

public class ParkingSpotService {

    final ParkingSpotService parkingSpotRepository;

    public ParkingSpotService(ParkingSpotService parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
