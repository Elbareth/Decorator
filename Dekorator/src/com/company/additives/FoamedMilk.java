package com.company.additives;

import com.company.interfaces.Coffee;

public class FoamedMilk extends Additives {

    private Coffee coffee;

    public FoamedMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {

        return coffee.getDescription() + super.getDescription()+"Foamed Milk; ";
    }

    @Override
    public Float getPrice() {

        return coffee.getPrice() + 1.5f;
    }
}
