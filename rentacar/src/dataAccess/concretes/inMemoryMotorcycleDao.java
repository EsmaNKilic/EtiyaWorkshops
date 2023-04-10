package dataAccess.concretes;

import dataAccess.abstracts.MotorcycleDao;
import entities.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class inMemoryMotorcycleDao implements MotorcycleDao {
    List<Motorcycle> motorcycles = new ArrayList<>();
    @Override
    public List<Motorcycle> getAll() {
        return motorcycles;
    }

    @Override
    public void add(Motorcycle motorcycle) {
    motorcycles.add(motorcycle);
    }

    @Override
    public Motorcycle update(int id) {
        return motorcycles.stream().filter(motorcycle -> motorcycle.getId() == id).findFirst().orElseThrow();
    }

    @Override
    public void delete(Motorcycle motorcycle) {
        motorcycles.remove(motorcycle);
    }
}
