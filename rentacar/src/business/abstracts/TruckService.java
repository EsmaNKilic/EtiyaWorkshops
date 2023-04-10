package business.abstracts;

import entities.Truck;

import java.util.List;

public interface TruckService {
    List<Truck> getAll();
    void add(Truck truck);
    Truck update(int id);
    void delete(Truck truck);

    boolean validate(int id);
}
