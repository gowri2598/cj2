package com.crio.session4.activity3.entities;

public abstract class Participant extends BaseEntity {
    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
