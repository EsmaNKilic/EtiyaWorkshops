package business.concretes;

import business.abstracts.CarService;
import dataAccess.abstracts.CarDao;
import entities.Car;

import java.util.List;

public class CarManager implements CarService {
    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public void add(Car car) {
        if(car.getPrice() <= 0){
            System.out.println("Fiyat 0'dan düşük olamaz!");
            return;
        }
        if(validate(car.getId())){
            carDao.add(car);
        }
    }

    @Override
    public Car update(int id) {
        return carDao.update(id);
    }

    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }

    @Override
    public boolean validate(int id) {
        var x = carDao.getAll().stream().anyMatch(car -> car.getId() == id);
        if(x == true){
            System.out.println("Bu id zaten var!" + " " + id);
            return false;
        }
        return true;
    }
}
