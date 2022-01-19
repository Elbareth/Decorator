package com.company.coffee;

import com.company.interfaces.Coffee;

public class Affogato implements Coffee {
    @Override
    public String getDescription() {
        return "Affogato";
    }

    @Override
    public Float getPrice() {
        return 3.0f;
    }
}
