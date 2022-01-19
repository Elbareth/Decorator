package com.company.coffee;

import com.company.interfaces.Coffee;

public class Vienna implements Coffee {
    @Override
    public String getDescription() {
        return "Vienna";
    }

    @Override
    public Float getPrice() {
        return 4.5f;
    }
}
