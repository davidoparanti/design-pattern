package com.davidoparanti.designpattern.design.pattern.decorator.impl;

import com.davidoparanti.designpattern.design.pattern.decorator.Beverage;

public class Espresso implements Beverage {
    private String description;

    public Espresso() {
         description = "Espresso";
    }

    @Override
    public String getDescription() {
        return  description;
    }

    @Override
    public double getCost() {
        return 5;
    }
}
