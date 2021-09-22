package GarageExercise;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if (this.vehicles.remove(v)) {
			System.out.println( v + "Removed");
		} else {
			System.out.println(v + "Not Found");
		}
	}
	
	public void removeVehicleType(String type) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType() == type) {
				found.add(vehicle);
			}
		}
		
		for (Vehicle destroy : found) {
			vehicles.remove(destroy);
		}
	}
	
	
	public void removeVehicleById(int id) {
		Vehicle found = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == id) {
				found = vehicle;
			}
		}
		removeVehicle(found);
	}
	
	
	public void emptyGarage() {
		System.out.println("\n\nVehicle(s) removed.");
		this.vehicles.clear();
	}
	
	public void calculateBill() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle.billCalculate());
			}
		
	}

	public void printAll() {
		
		for (Vehicle vehicle : this.vehicles) {
		System.out.println(vehicle);
		}
	}
	
	 

}






