import model.Persom;

import java.time.LocaDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! Nice to meet you!");

        Person tom = new Person(firstName: "Tom", lastName: "Smith", LocalDate.of(1984, 6, 15));
        Person janet = new Person(firstName: "Janet", lastName: "Jakson", LocalDate.of(1985, 12, 3));

        tom.setSpouse(janet);

        Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1));
    }
}
