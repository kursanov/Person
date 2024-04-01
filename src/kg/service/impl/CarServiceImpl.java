package kg.service.impl;

import kg.dao.CarDao;
import kg.models.Car;
import kg.models.Person;
import kg.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void saveCar(Long id ,Car car) {
        carDao.saveCar(id,car);
    }

    @Override
    public List<Car> getCarByPersonId(Long personId) {
        return  carDao.getCarByPersonId(personId);

    }

    @Override
    public Car getCarById(Long id) {
        return carDao.getCarById(id);
    }

    @Override
    public void updateCarById(Long id,Car car) {
        carDao.updateCarById(id,car);
    }

    @Override
    public String deleteCarById(Long id) {
       return carDao.deleteCarById(id);

    }
}
