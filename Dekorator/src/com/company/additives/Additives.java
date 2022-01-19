package com.company.additives;

import com.company.interfaces.Coffee;

public abstract class Additives implements Coffee {
    private String description = " z ";

    @Override
    public String getDescription() {
        return this.description;
    }
}
