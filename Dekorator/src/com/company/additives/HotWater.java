package com.company.additives;

import com.company.interfaces.Coffee;

public class HotWater extends Additives{

    private Coffee coffee;

    public HotWater(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {

        return coffee.getDescription() + super.getDescription()+"Hot Water; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 0.5f;
    }
}
