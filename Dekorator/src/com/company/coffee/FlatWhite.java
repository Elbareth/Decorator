package com.company.coffee;

import com.company.interfaces.Coffee;

public class FlatWhite implements Coffee {
    @Override
    public String getDescription() {
        return "Flat White";
    }

    @Override
    public Float getPrice() {
        return 3.0f;
    }
}
