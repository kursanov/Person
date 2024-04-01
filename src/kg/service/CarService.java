package kg.service;

import kg.models.Car;
import kg.models.Person;

import java.util.List;

public interface CarService {


    void saveCar(Long id,Car car);
    List<Car> getCarByPersonId(Long personId);
    Car getCarById(Long id);
    void updateCarById(Long id,Car car);
    String deleteCarById(Long id);
}
