package com.company.additives;

import com.company.interfaces.Coffee;

public class Whiskey extends Additives{

    private Coffee coffee;

    public Whiskey(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Whiskey; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 5.0f;
    }
}
