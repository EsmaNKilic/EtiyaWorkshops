package business.concretes;

import business.abstracts.MotorcycleService;
import dataAccess.abstracts.MotorcycleDao;
import entities.Motorcycle;

import java.util.List;

public class MotorcycleManager implements MotorcycleService {
    private final MotorcycleDao motorcycleDao;

    public MotorcycleManager(MotorcycleDao motorcycleDao) {
        this.motorcycleDao = motorcycleDao;
    }


    @Override
    public List<Motorcycle> getAll() {
        return motorcycleDao.getAll();
    }

    @Override
    public void add(Motorcycle motorcycle) {
        if(motorcycle.getPrice() <= 0){
            System.out.println("Fiyat 0'dan düşük olamaz!");
            return;
        }
        if(validate(motorcycle.getId())) {
            motorcycleDao.add(motorcycle);
        }
    }

    @Override
    public Motorcycle update(int id) {
        return motorcycleDao.update(id);
    }

    @Override
    public void delete(Motorcycle motorcycle) {
        motorcycleDao.delete(motorcycle);
    }

    @Override
    public boolean validate(int id) {
        var motorcycleIdCheck = motorcycleDao.getAll().stream().anyMatch(motorcycle -> motorcycle.getId() == id);
        if(motorcycleIdCheck == true){
            System.out.println("Bu id zaten var!" + " " + id);
            return false;
        }
        return true;
    }
}
