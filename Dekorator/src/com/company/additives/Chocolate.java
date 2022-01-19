package com.company.additives;

import com.company.interfaces.Coffee;

public class Chocolate extends Additives {

    private Coffee coffee;

    public Chocolate(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {

        return coffee.getDescription() + super.getDescription()+"Chocolate; ";
    }

    @Override
    public Float getPrice() {

        return coffee.getPrice() + 1.5f;
    }
}
