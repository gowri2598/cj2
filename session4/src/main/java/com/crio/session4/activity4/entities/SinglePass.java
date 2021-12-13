package com.crio.session4.activity4.entities;

import com.crio.session4.activity4.entities.PassType;

public class SinglePass extends Pass {
    public SinglePass(Toll toll, TollBooth booth, Vehicle vehicle) {
        super(toll, booth, vehicle);
        this.status = PassStatus.VALID;
        this.type = PassType.SINGLE;
    }

    @Override
    public boolean isValidPass(Toll toll){
        return (this.status==PassStatus.VALID && this.getToll().equals(toll));
    }

    @Override
    public void updatePass(){
        this.setStatus(PassStatus.EXPIRED);
    }

    // Builder ( Optional )
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString
}
