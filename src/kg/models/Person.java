package kg.models;

import kg.db.Database;

import java.util.List;

public class Person {

    private Long id;

    private String firstName;
    private String lastName;

    private int age;

    private String email;

    private List<Car> cars;

    private List<SocialMedia> socialMedias;


    public Person(int age) {
        this.age = age;
    }

    public Person(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }



    public Person() {
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<SocialMedia> getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(List<SocialMedia> socialMedias) {
        this.socialMedias = socialMedias;
    }


    public void addCar(Car car){
        Database.cars.add(car);
        System.out.println("Car success added!");
    }

    public  void addSocialMedia(SocialMedia  socialMedia){
        Database.socialMedias.add(socialMedia);
        System.out.println("SocialMedias success added!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cars=" + cars +
                ", socialMedias=" + socialMedias +
                '}';
    }
}
