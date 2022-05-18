package com.crio.session7.activity1.waffle_decorator.fruits;

import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public class Pineapple extends BaseFruit {

    public Pineapple(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Pineapple ";
    }
}
