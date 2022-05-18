package com.crio.session7.activity1.waffle_decorator.sauce;

import com.crio.session7.activity1.waffle_decorator.BaseDecorator;
import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public abstract class BaseSauce extends BaseDecorator {

    public BaseWaffle baseWaffle;

    public BaseSauce(BaseWaffle waffleToDecorate){
        this.baseWaffle = waffleToDecorate;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return (this.baseWaffle.getPrice() + this.price);
    }
}
