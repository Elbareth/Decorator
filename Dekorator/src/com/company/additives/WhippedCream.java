package com.company.additives;

import com.company.interfaces.Coffee;

public class WhippedCream extends Additives {

    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + super.getDescription()+"Whipped Cream; ";
    }

    @Override
    public Float getPrice() {
        return coffee.getPrice() + 1.5f;
    }
}
