package com.company;

import com.company.additives.*;
import com.company.coffee.Irish;
import com.company.coffee.Latte;
import com.company.coffee.Vienna;
import com.company.interfaces.Coffee;

public class Main {

    public static void main(String[] args) {
        Coffee latte = new Chocolate(new FoamedMilk(new Ice(new Latte())));
        System.out.println(latte.getDescription());
        System.out.println(latte.getPrice());
        System.out.println("-------------------------------------------------------");
        Coffee vienna = new WhippedCream(new VanillaIceCream(new Chocolate(new Chocolate(new FoamedMilk(new Vienna())))));
        System.out.println(vienna.getDescription());
        System.out.println(vienna.getPrice());
        System.out.println("-------------------------------------------------------");
        Coffee irish = new Brandy(new Whiskey(new Ice(new Syrup(new Irish()))));
        System.out.println(irish.getDescription());
        System.out.println(irish.getPrice());
        System.out.println("-------------------------------------------------------");

    }
}
