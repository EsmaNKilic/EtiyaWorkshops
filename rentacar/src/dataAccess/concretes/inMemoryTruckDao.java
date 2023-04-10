package dataAccess.concretes;
import dataAccess.abstracts.TruckDao;
import entities.Truck;

import java.util.ArrayList;
import java.util.List;

public class inMemoryTruckDao implements TruckDao {
    List<Truck> trucks = new ArrayList<>();
    @Override
    public List<Truck> getAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public Truck update(int id) {
        return trucks.stream().filter(truck -> truck.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public void delete(Truck truck) {
        trucks.remove(truck);
    }
}
