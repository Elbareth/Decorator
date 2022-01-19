package com.company.coffee;

import com.company.interfaces.Coffee;

public class ConPanna implements Coffee {
    @Override
    public String getDescription() {
        return "Con Panna";
    }

    @Override
    public Float getPrice() {
        return 3.0f;
    }
}
