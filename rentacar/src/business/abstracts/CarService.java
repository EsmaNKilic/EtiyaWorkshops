package business.abstracts;

import entities.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();
    void add(Car car);
    Car update(int id);
    void delete(Car car);

    boolean validate(int id);
}
