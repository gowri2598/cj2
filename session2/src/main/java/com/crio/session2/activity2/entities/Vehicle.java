package com.crio.session2.activity2.entities;

public abstract class Vehicle extends BaseEntity {
    private String regNo;
    
    public Vehicle(String regNo){
        this.regNo = regNo;
    }

    public String getRegNo(){
        return regNo;
    }
}
