package src.Product;

import VehicleInventory.IVehicleInventory;
import src.VehicleInventory.CarInventoryImpl;

import java.util.List;

public class Store {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public IVehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(IVehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    private int id;
    private Location location;
    private IVehicleInventory vehicleInventory;
    private List<Reservation> reservations;


    public List<Vehicle> getAllVehicles(Utils.VehicleType vehicleType){
        return vehicleInventory.getListOfVehicle();
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReservation(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }


    public boolean completeReservation(int reservationID) {
        return true;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventory = new CarInventoryImpl(vehicles);
    }


}
