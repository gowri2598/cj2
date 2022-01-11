package com.crio.session2.activity1.entities;

public abstract class Participant extends BaseEntity {
    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
