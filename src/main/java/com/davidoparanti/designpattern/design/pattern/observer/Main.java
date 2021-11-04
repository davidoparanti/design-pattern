package com.davidoparanti.designpattern.design.pattern.observer;

import com.davidoparanti.designpattern.design.pattern.observer.impl.Client;
import com.davidoparanti.designpattern.design.pattern.observer.impl.DailyMedia;

public class Main {

    public static void main(String[] args) {
        DailyMedia subject = new DailyMedia();

        Client gtBank = new Client("GtBank");
        Client firstBank = new Client("FirstBank");
        Client CityBank = new Client("CitiBank");

        subject.registerObserver(gtBank);
        subject.registerObserver(firstBank);
        subject.registerObserver(CityBank);

        subject.setMessage("Good is good to me");



        System.out.println(gtBank.getMessage());
        System.out.println(firstBank.getMessage());
        System.out.println(CityBank.getMessage());
    }
}
