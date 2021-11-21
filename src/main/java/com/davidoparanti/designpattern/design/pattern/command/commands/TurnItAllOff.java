package com.davidoparanti.designpattern.design.pattern.command.commands;

import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;

import java.util.List;

public class TurnItAllOff implements Command{
    private List<ElectronicDevice> electronicDevices;

    public TurnItAllOff(List<ElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }


    @Override
    public void execute() {
        for (ElectronicDevice device : electronicDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : electronicDevices) {
            device.on();
        }
    }
}
