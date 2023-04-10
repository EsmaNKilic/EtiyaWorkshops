package dataAccess.concretes;

import dataAccess.abstracts.CarDao;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class inMemoryCarDao implements CarDao {
    List<Car> cars = new ArrayList<>();
    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public Car update(int id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }
}
