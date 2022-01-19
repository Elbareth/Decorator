package com.company.coffee;

import com.company.interfaces.Coffee;

public class Macchiato implements Coffee {
    @Override
    public String getDescription() {
        return "Macchiato";
    }

    @Override
    public Float getPrice() {
        return 3.5f;
    }
}
