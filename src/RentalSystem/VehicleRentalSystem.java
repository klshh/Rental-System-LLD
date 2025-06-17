package src.RentalSystem;

import src.Product.Location;
import src.Product.Store;
import src.Product.User;

import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;


    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }

    public Store getStore(Location location){
//        based upon filters in location obj
        return stores.get(0);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Store> getStores() {
        return stores;
    }
}
