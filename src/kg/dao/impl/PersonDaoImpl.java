package kg.dao.impl;

import kg.dao.PersonDao;
import kg.db.Database;
import kg.models.Car;
import kg.models.Person;

import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public void savePerson(Person person) {
        Database.persons.add(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return Database.persons;
    }

    @Override
    public Person getPersonByName(String name) {
        for (Person person : Database.persons) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person updatePersonById(Long id,Person person) {
        for (Person person1 : Database.persons) {
            if (person1.getId().equals(id)){
                person1.setId(person.getId());
                person1.setFirstName(person.getFirstName());
                person1.setLastName(person.getLastName());
                person1.setEmail(person.getEmail());
                person1.setAge(person.getAge());
            }
        }
        return null;
    }

    @Override
    public String deletePersonById(Long id) {
        for (Person person : Database.persons) {
            if (person.getId().equals(id)){
                Database.persons.remove(person);
            }
        }

        return null;
    }
}
