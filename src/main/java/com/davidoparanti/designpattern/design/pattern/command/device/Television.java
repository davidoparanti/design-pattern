package com.davidoparanti.designpattern.design.pattern.command.device;

import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;

public class Television implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Tv is on");
    }

    @Override
    public void off() {
        System.out.println("Tv is off");
    }

    @Override
    public void volumeUp() {
        System.out.println("The Tv volume is " + ++volume);
    }

    @Override
    public void volumeDown() {
        System.out.println("The Tv volume is " + --volume);
    }
}
