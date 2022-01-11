package com.crio.session2.activity2.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class WeeklyPass extends Pass {
    private Date validUpTo;

    public WeeklyPass(Toll toll, TollBooth booth, Vehicle vehicle) {
        super(toll, booth, vehicle);
        this.validUpTo = new Date();
        this.status = PassStatus.VALID;
        this.type = PassType.WEEKLY;
    }

    private Date setValidUpTo() {
        Date newDate = new Date();
        LocalDateTime.from(newDate.toInstant()).plusDays(7);
        return newDate;
    }


    @Override
    public void updatePass(){
        Date currentDate = new Date();
        if(this.validUpTo.before(currentDate)){
            this.setStatus(PassStatus.EXPIRED);
        }
    }

    @Override
    public boolean isValidPass(Toll toll){
        return (this.status==PassStatus.VALID && this.getToll().equals(toll));
    }

    // Builder ( Optional )
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString
}
