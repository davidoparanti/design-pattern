package com.davidoparanti.designpattern.design.pattern.command.commands;

import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;

public class TurnTvOn implements Command{
    private ElectronicDevice device;

    public TurnTvOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
