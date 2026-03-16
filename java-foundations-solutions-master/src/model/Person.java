package model;
import model.Person;
import java.time.LocalDate;


import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Address getAddress() {
        return address;
    }

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }


    public Person getSpouse() {
        return spouse;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }
}
