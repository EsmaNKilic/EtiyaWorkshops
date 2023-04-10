package dataAccess.abstracts;

import entities.Motorcycle;

import java.util.List;

public interface MotorcycleDao {

    List<Motorcycle> getAll();
    void add(Motorcycle motorcycle);
    Motorcycle update(int id);
    void delete(Motorcycle motorcycle);
}
