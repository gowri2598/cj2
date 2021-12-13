package com.crio.session4.activity4.entities;

import java.util.List;

public class Toll extends BaseEntity{
    private final List<TollBooth> booths;
    private final LeaderBoard leaderBoard;

    public Toll(List<TollBooth> booths){
        this.booths = booths;
        this.leaderBoard = new LeaderBoard(this.booths);
    }

    // Builder ( Optional )
    // AllArgsConstructor ( Some of them good to have as required)
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString

}
