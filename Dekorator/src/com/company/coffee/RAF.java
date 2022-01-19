package com.company.coffee;

import com.company.interfaces.Coffee;

public class RAF implements Coffee {
    @Override
    public String getDescription() {
        return "RAF";
    }

    @Override
    public Float getPrice() {
        return 6.0f;
    }
}
