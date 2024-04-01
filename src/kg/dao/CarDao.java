package kg.dao;

import kg.models.Car;

import java.util.List;

public interface CarDao {

    void saveCar(Long id,Car car);
    List<Car> getCarByPersonId(Long PersonId);
    Car getCarById(Long id);
    void updateCarById(Long id,Car car);
    String deleteCarById(Long id);
}
