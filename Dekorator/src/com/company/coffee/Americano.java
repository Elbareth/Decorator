package com.company.coffee;

import com.company.interfaces.Coffee;

public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public Float getPrice() {
        return 2.0f;
    }
}
