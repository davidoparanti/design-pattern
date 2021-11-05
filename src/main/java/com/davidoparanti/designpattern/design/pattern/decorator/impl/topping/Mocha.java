package com.davidoparanti.designpattern.design.pattern.decorator.impl.topping;

import com.davidoparanti.designpattern.design.pattern.decorator.Beverage;
import com.davidoparanti.designpattern.design.pattern.decorator.Condiment;

public class Mocha extends Condiment {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.5 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
