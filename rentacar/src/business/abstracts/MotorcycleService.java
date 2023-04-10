package business.abstracts;

import entities.Motorcycle;

import java.util.List;

public interface MotorcycleService {
    List<Motorcycle> getAll();
    void add(Motorcycle motorcycle);
    Motorcycle update(int id);
    void delete(Motorcycle motorcycle);

    boolean validate(int id);
}
