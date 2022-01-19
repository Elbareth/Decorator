package com.company.additives;

import com.company.interfaces.Coffee;

public class Cinnamon extends Additives {

    private Coffee coffee;

    public Cinnamon(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {

        return coffee.getDescription() + super.getDescription()+"Cinnamon; ";
    }

    @Override
    public Float getPrice() {

        return coffee.getPrice() + 0.5f;
    }
}
