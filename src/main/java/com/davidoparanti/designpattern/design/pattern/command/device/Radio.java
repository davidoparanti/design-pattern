package com.davidoparanti.designpattern.design.pattern.command.device;

public class Radio implements ElectronicDevice{
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }

    @Override
    public void volumeUp() {
        System.out.println("The radio volume is " + ++volume);
    }

    @Override
    public void volumeDown() {
        System.out.println("The radio volume is " + --volume);
    }
}
