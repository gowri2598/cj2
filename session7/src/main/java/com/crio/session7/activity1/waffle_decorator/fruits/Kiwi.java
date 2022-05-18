package com.crio.session7.activity1.waffle_decorator.fruits;

import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public class Kiwi extends BaseFruit {

    public Kiwi(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Kiwi ";
    }
}
