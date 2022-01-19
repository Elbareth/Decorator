package com.company.additives;

import com.company.interfaces.Coffee;

public class Brandy extends Additives{

    private Coffee coffee;

    public Brandy(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription() + "Brandy; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 2.0f;
    }
}
