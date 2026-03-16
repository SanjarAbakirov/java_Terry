package model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private String dob;

    public Pet(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }
}
