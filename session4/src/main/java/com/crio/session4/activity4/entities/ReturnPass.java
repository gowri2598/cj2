package com.crio.session4.activity4.entities;

import com.crio.session4.activity4.entities.PassType;

public class ReturnPass extends Pass{
    private Integer numberOfTrips;

    public ReturnPass(Toll toll, TollBooth booth, Vehicle vehicle) {
        super(toll, booth, vehicle);
        this.status = PassStatus.VALID;
        this.numberOfTrips = 1;
        this.type = PassType.RETURN;
    }

    @Override
    public boolean isValidPass(Toll toll){
        return (this.getToll().equals(toll) && this.status==PassStatus.VALID);
    }

    @Override
    public void updatePass(){
        this.numberOfTrips++;
        this.setStatus(PassStatus.EXPIRED);
    }

    // Builder ( Optional )
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString
}
