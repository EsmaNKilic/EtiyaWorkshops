package dataAccess.abstracts;

import entities.Truck;

import java.util.List;

public interface TruckDao{
    List<Truck> getAll();
    void add(Truck truck);
    Truck update(int id);
    void delete(Truck truck);
}
