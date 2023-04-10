package api;

import business.abstracts.CarService;
import business.concretes.CarManager;
import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.MotorcycleDao;
import dataAccess.abstracts.TruckDao;
import dataAccess.concretes.inMemoryCarDao;
import dataAccess.concretes.inMemoryMotorcycleDao;
import dataAccess.concretes.inMemoryTruckDao;
import entities.Car;

public class Main {
    public static void main(String[] args) {

        // FOR CAR

       Car car1 = new Car(1,"opel","beyaz",400000);
       Car car2 = new Car(2,"skoda","gümüş",600000);
       Car car3 = new Car(2,"audi","bej",900000);

       CarDao inMemoryCarDao = new inMemoryCarDao();

        // Add
       CarService carService = new CarManager(inMemoryCarDao);
       carService.add(car1);
       carService.add(car2);
       carService.add(car3);

        // Update
       var updated = carService.update(1);
       updated.setBrand("mercedes");

        // Delete
       carService.delete(car3);

        // To List

       for(Car car : carService.getAll()){
           System.out.println(car.getId() + " " + car.getBrand());
       }

    }
}