package com.davidoparanti.designpattern.design.pattern.decorator.impl.topping;

import com.davidoparanti.designpattern.design.pattern.decorator.Beverage;
import com.davidoparanti.designpattern.design.pattern.decorator.Condiment;

public class Whip extends Condiment {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Whip";
    }
}
