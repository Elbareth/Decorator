package com.company.coffee;

import com.company.interfaces.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Float getPrice() {
        return 1.0f;
    }
}
