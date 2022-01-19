package com.company.additives;

import com.company.interfaces.Coffee;

public class LemonJuice extends Additives{

    private Coffee coffee;

    public LemonJuice(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Lemon Juice; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 1.0f;
    }
}
