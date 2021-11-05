package com.davidoparanti.designpattern.design.pattern.decorator.impl;

import com.davidoparanti.designpattern.design.pattern.decorator.Beverage;

public class HouseBlend implements Beverage {
    private String description;
    public HouseBlend() {
         description = "House blend";
    }
    public String getDescription() {
        return description;
    }
    @Override
    public double getCost() {
        return 4;
    }
}
