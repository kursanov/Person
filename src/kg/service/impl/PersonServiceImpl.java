package kg.service.impl;

import kg.dao.PersonDao;
import kg.db.Database;
import kg.models.Person;
import kg.service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {


    private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void savePerson(Person person) {
        personDao.savePerson(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return Database.persons;
    }

    @Override
    public Person getPersonByName(String name) {
        return personDao.getPersonByName(name);
    }

    @Override
    public Person updatePersonById(Long id,Person person) {
        return personDao.updatePersonById(id,person);
    }

    @Override
    public String deletePersonById(Long id) {
        return personDao.deletePersonById(id);
    }
}
