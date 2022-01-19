package com.company.coffee;

import com.company.interfaces.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public Float getPrice() {
        return 2.5f;
    }
}
