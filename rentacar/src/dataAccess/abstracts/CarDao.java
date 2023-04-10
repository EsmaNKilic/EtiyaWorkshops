package dataAccess.abstracts;

import entities.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAll();
    void add(Car car);
    Car update(int id);
    void delete(Car car);
}
