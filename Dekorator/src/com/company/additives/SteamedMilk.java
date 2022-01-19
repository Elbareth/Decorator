package com.company.additives;

import com.company.interfaces.Coffee;

public class SteamedMilk extends Additives{

    private Coffee coffee;

    public SteamedMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Steamed Milk; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 1.5f;
    }
}
