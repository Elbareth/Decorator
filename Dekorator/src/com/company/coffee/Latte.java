package com.company.coffee;

import com.company.interfaces.Coffee;

public class Latte implements Coffee {
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public Float getPrice() {
        return 4.0f;
    }
}
