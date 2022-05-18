package com.crio.session7.activity1.waffle_decorator.nuts;

import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public class Hazelnut extends BaseNuts {

    public Hazelnut(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 1.00;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Hazelnut ";
    }
}