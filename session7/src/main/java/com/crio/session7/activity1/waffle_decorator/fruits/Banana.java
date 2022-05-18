package com.crio.session7.activity1.waffle_decorator.fruits;

import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public class Banana extends BaseFruit {

    public Banana(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Banana  ";
    }
}
