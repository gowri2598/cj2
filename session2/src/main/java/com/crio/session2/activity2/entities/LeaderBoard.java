package com.crio.session2.activity2.entities;

import java.util.List;

public class LeaderBoard extends BaseEntity {
    private final List<TollBooth> booths;

    public LeaderBoard(List<TollBooth> booths){
        this.booths = booths;
    }

    public List<TollBooth> getTollboothsRankWise(){
        // Java Stream logic
        return null;
    }

    //Copy Constructor
    //equals and hashcode
    //toString
}
