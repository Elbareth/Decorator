package com.company.additives;

import com.company.interfaces.Coffee;

public class Ice extends Additives{

    private Coffee coffee;

    public Ice(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Ice; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 0.5f;
    }
}
