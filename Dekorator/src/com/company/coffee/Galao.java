package com.company.coffee;

import com.company.interfaces.Coffee;

public class Galao implements Coffee {
    @Override
    public String getDescription() {
        return "Galao";
    }

    @Override
    public Float getPrice() {
        return 3.0f;
    }
}
