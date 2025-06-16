package VehicleInventory;

import Units.Vehicle;

import java.util.List;

public class CarInventoryImpl implements IVehicleInventory{

    List<Vehicle> vehicles;

    CarInventoryImpl(List<Vehicle> vehicles) {
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
        return null;
    }
}
