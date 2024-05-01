package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    //   @Autowired //INJETANDO DEPENDENCIA DO REPOSITORY NO SERVICE
    //   ParkingSpotRepository parkingSpotRepository;

    //INJETANDO DEPENDENCIA ATRAVES DE UM CONSTRUTOR
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

}
