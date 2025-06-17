package src.VehicleInventory;

import src.Product.Vehicle;

import java.util.List;

public class CarInventoryImpl implements VehicleInventory.IVehicleInventory {

    List<Vehicle> vehicles;

    public CarInventoryImpl(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        //filtering
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public List<Vehicle> getListOfVehicle() {
        return vehicles;
    }
}
