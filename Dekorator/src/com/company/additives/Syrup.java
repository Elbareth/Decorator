package com.company.additives;

import com.company.interfaces.Coffee;

public class Syrup extends Additives{

    private Coffee coffee;

    public Syrup(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Syrup; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 2.0f;
    }
}
