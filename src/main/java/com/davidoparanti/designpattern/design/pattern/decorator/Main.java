package com.davidoparanti.designpattern.design.pattern.decorator;

import com.davidoparanti.designpattern.design.pattern.decorator.impl.Espresso;
import com.davidoparanti.designpattern.design.pattern.decorator.impl.HouseBlend;
import com.davidoparanti.designpattern.design.pattern.decorator.impl.topping.Mocha;
import com.davidoparanti.designpattern.design.pattern.decorator.impl.topping.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Whip(new HouseBlend()));

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        Beverage beverage1 = new Whip(new Whip(new Mocha(new Espresso())));

        Beverage beverage2 = new Mocha(new Mocha(new Whip(new Espresso())));

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.getCost());

        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.getCost());
    }

}
