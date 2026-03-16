package model;

public class Dog extends Pet {
    public Dog(){

    }
public Dog(String name, Localdate dob){
        super(name, dob);
}

    public void bark() {
        System.out.println("Ruff ruff!!!");
    }


}
