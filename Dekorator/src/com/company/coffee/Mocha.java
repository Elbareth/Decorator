package com.company.coffee;

import com.company.interfaces.Coffee;

public class Mocha implements Coffee {
    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public Float getPrice() {
        return 3.5f;
    }
}
