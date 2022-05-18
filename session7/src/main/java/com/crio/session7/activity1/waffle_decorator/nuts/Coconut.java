package com.crio.session7.activity1.waffle_decorator.nuts;

import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public class Coconut extends BaseNuts {

    public Coconut(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 1.00;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Coconut ";
    }
}
