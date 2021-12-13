package com.crio.session4.activity3.entities;

public class User extends Participant{
    private TimeSlot workingHours;

    public User(String name, TimeSlot workingHours) {
        super(name);
        this.workingHours = workingHours;
    }

    // Builder ( Optional )
    // AllArgsConstructor ( Some of them good to have as required)
    //Copy Constructor
    //Getters and Setters
    //equals and hashcode
    //toString 
}
