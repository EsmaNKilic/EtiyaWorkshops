package api;

import business.abstracts.CarService;
import business.concretes.CarManager;
import dataAccess.abstracts.CarDao;
import dataAccess.concretes.inMemoryCarDao;
import entities.Car;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car(1,"opel","beyaz",400000);
       Car car2 = new Car(2,"skoda","gümüş",600000);
       Car car3 = new Car(2,"audi","bej",900000);
       Car car4 = new Car(4,"chevrolet","kahverengi",120000);

        CarDao inMemoryCarDao = new inMemoryCarDao();

        CarService carService = new CarManager(inMemoryCarDao);
        carService.add(car1);
        carService.add(car2);
        carService.add(car3);
        carService.add(car4);

        var updated = carService.update(1);
        updated.setBrand("mercedes");

        carService.delete(car4);

        for(Car car : carService.getAll()){
            System.out.println(car.getId() + " " + car.getBrand());
        }
    }
}