import kg.dao.CarDao;
import kg.dao.PersonDao;
import kg.dao.SocialMediaDao;
import kg.dao.impl.CarDaoImpl;
import kg.dao.impl.PersonDaoImpl;
import kg.dao.impl.SocialMediaImpl;
import kg.models.Car;
import kg.models.Person;
import kg.models.SocialMedia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CarDao car= new CarDaoImpl();
        PersonDao person = new PersonDaoImpl();
        SocialMediaDao socialMedia = new SocialMediaImpl();


        while (true){
            System.out.println("""
                    1.Save person
                    2.Get car by id
                    3.Update car by id
                    4.Deleted car
                    5.Get car by person id
                    6.Save car
                    7.Get all persons
                    8.Get person by name
                    9.Update person
                    10.Delete person
                    11.SocialMedia save
                    12.Get social media by ID
                    """);
            switch (new Scanner(System.in).nextInt()){
                case 1:{
                    person.savePerson(new Person(1L,"zarip","Kursan","z@gmail.com"));break;
                }
                case 2:{
                    System.out.println(car.getCarById(1L));break;
                }
                case 3:{
                    car.updateCarById(1L,new Car(2L,"M5","BMW",2023));break;
                }
                case 4:{
                    car.deleteCarById(2L);break;
                }
                case 5:{
                    System.out.println(car.getCarByPersonId(1L));break;
                }
                case 6:{
                    car.saveCar(1L,new Car(1L,"Maybag","Mers",2021));break;
                }
                case 7:{
                    System.out.println(person.getAllPerson());break;
                }
                case 8:{
                    System.out.println(person.getPersonByName("zarip"));break;
                }
                case 9:{
                    System.out.println(person.updatePersonById(1L, new Person(2L, "Kyial", "Asan", "k@gmail.com")));break;
                }
                case 10:{
                    System.out.println(person.deletePersonById(2L));break;
                }
                case 11:{
                    System.out.println(socialMedia.saveSocialMedia(1L, new SocialMedia(1l, "Yr")));break;
                }
                case 12:{
                    System.out.println(socialMedia.getSocialMediaById(1L));break;
                }

            }
        }





    }
}