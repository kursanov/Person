package kg.dao.impl;

import kg.dao.CarDao;
import kg.db.Database;
import kg.models.Car;
import kg.models.Person;

import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public void saveCar(Long personId,Car car) {
        Person personToUpdate = null;

        for (Person person : Database.persons) {
            if (person.getId().equals(personId)) {
                personToUpdate = person;
                break;
            }
        }

        if (personToUpdate != null) {
            personToUpdate.addCar(car);
            System.out.println("Car saved for person with ID: " + personId);
        } else {
            System.out.println("Person with ID " + personId + " not found.");
        }

    }


    @Override
    public List<Car> getCarByPersonId(Long personId) {
        for (Person person : Database.persons) {
            if (person.getId().equals(personId)){
                System.out.println(person.getCars());
            }
        }

        return null;
    }

    @Override
    public Car getCarById(Long id) {
        for (Car car : Database.cars) {
            if (car.getId().equals(id)){
                return car;
            }
        }

        return null;
    }

    @Override
    public void updateCarById(Long id,Car car) {
        for (Car car1 : Database.cars) {
            if (car1.getId().equals(id)){
                car1.setId(car.getId());
                car1.setName(car.getName());
                car1.setModel(car.getModel());
                car1.setYear(car.getYear());
            }
        }
    }







    @Override
    public String deleteCarById(Long id) {
        for (Person person : Database.persons) {
            for (Car car : person.getCars()) {
                if (car.getId().equals(id)){
                    Database.cars.remove(car);
                }
            }
        }
        return "Success deleted";
    }
}
