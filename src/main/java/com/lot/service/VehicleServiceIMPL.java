package com.lot.service;

import com.lot.model.Vehicle;
import com.lot.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VehicleServiceIMPL implements VehicleService{

    private VehicleRepository vehicleRepository;
    @Override
    public List<Vehicle> findAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Iterable<Vehicle> vehicleItr = vehicleRepository.findAll();
        vehicleItr.forEach(vehicles::add);
        return vehicles;    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
