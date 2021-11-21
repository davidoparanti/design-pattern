package com.davidoparanti.designpattern.design.pattern.command.commands;

import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;

public class TurnTvOff implements Command{

    private ElectronicDevice device;

    public TurnTvOff(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
