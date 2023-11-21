package com.lot;

import com.lot.model.Car;
import com.lot.model.Owner;
import com.lot.model.Truck;
import com.lot.model.Vehicle;
import com.lot.service.OwnerService;
import com.lot.service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ConsignmentLotApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConsignmentLotApplication.class, args);

		OwnerService ownerService = context.getBean(OwnerService.class);

		Owner owner = new Owner();
		owner.setName("Bryan");

		//comment this out and see what happens!
		owner = ownerService.save(owner);

		VehicleService vehicleService = context.getBean(VehicleService.class);

		List<Owner> owners = new ArrayList<>();
		owners.add(owner);

		Truck truck = new Truck();
		truck.set4wd(true);
		truck.setMake("Dodge");
		truck.setOwners(owners);

		Vehicle v1 = vehicleService.save(truck);

		Car car = new Car();
		car.setMake("Subaru");
		car.setType("Crosstrek");
		car.setOwners(owners);

		Vehicle v2 =vehicleService.save(car);

		System.out.println(v1.getId());
		System.out.println(v1.getMake());
		System.out.println(v2.getId());
		System.out.println(v2.getMake());

		List<Vehicle> vehicles = vehicleService.findAllVehicles();
		for(Vehicle vehicle: vehicles) {
			System.out.println(vehicle.getMake());
			System.out.println(vehicle.getOwners());
		}
	}
}
