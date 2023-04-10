package business.concretes;

import business.abstracts.TruckService;
import dataAccess.abstracts.TruckDao;
import entities.Truck;

import java.util.List;

public class TruckManager implements TruckService {
    private final TruckDao truckDao;

    public TruckManager(TruckDao truckDao) {
        this.truckDao = truckDao;
    }

    @Override
    public List<Truck> getAll() {
        return truckDao.getAll();
    }

    @Override
    public void add(Truck truck) {
        if(truck.getPrice() <= 0){
            System.out.println("Fiyat 0'dan düşük olamaz!");
            return;
        }
        if (validate(truck.getId())){
            truckDao.add(truck);
        }
    }

    @Override
    public Truck update(int id) {
        return truckDao.update(id);
    }

    @Override
    public void delete(Truck truck) {
        truckDao.delete(truck);
    }

    @Override
    public boolean validate(int id) {
        var truckIdCheck = truckDao.getAll().stream().anyMatch(truck -> truck.getId() == id);
        if(truckIdCheck == true){
            System.out.println("Bu id zaten var!" + " " + id);
            return false;
        }
        return true;
    }


}
