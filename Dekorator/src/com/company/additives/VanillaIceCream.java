package com.company.additives;

import com.company.interfaces.Coffee;

public class VanillaIceCream extends Additives{

    private Coffee coffee;

    public VanillaIceCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Vanilla Ice Cream; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 2.5f;
    }
}
