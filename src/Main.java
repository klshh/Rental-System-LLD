package src;

import Utils.VehicleType;
import src.Payment.IPaymentContext;
import src.Payment.UpiStrategy;
import src.Product.*;
import src.RentalSystem.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

//        Step 1: Add User
        List<User> userList = addUser();
//        Step 2: Add Vehicles
        List<Vehicle> vehicleList = addVehicles();
//        Step 3: Add Stores(vehicles)
        List<Store> stores = addStores(vehicleList);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(userList, stores);

//        Step 4: User comes
        User user = userList.get(0);
//        Step 5: Based on location fetch stores
        Location location = new Location("120 - R model town", "Bangalore", 1224001L);
        Store store = rentalSystem.getStore(location);

//        Step 6: List of vehicles of that store
        List<Vehicle> storeVehicles = store.getAllVehicles(VehicleType.CAR);
//        Step 7: Made a reservation
        Reservation reservation = store.createReservation(storeVehicles.get(0), userList.get(0));
//        Step 8: Generate a Bill
        Bill bill = new Bill(reservation);
//        Step 9: Make Payment
        IPaymentContext paymentContext = new UpiStrategy();
        paymentContext.payBill(bill);
//        Step 10: Complete Reservation
        store.completeReservation(reservation.getReservationId());
    }

    private static List<Store> addStores(List<Vehicle> vehicleList) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.setId(1);
        store1.setVehicles(vehicleList);

        stores.add(store1);
        return stores;

    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setId(1);
        vehicle1.setVehicleType(Utils.VehicleType.CAR);

        Vehicle vehicle2 = new Vehicle();
        vehicle1.setId(2);
        vehicle1.setVehicleType(Utils.VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;

    }

    private static List<User> addUser() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1L, "Kalash" , "HR10W5640");
        users.add(user1);
        return users;

    }

}
