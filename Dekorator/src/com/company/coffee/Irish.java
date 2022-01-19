package com.company.coffee;

import com.company.interfaces.Coffee;

public class Irish implements Coffee {
    @Override
    public String getDescription() {
        return "Irish";
    }

    @Override
    public Float getPrice() {
        return 5.0f;
    }
}
