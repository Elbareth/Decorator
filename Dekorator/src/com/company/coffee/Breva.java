package com.company.coffee;

import com.company.interfaces.Coffee;

public class Breva implements Coffee {
    @Override
    public String getDescription() {
        return "Breva";
    }

    @Override
    public Float getPrice() {
        return 3.0f;
    }
}
