package com.crio.session7.activity1.waffle_decorator.fruits;

import com.crio.session7.activity1.waffle_decorator.BaseDecorator;
import com.crio.session7.activity1.waffle_dough.BaseWaffle;

public abstract class BaseFruit extends BaseDecorator {

    public BaseWaffle baseWaffle;

    public BaseFruit(BaseWaffle waffleToDecorate){
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
