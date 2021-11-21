package com.davidoparanti.designpattern.design.pattern.command.commands;

import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;

public class TurnVolumeUp implements Command{
    private ElectronicDevice device;

    public TurnVolumeUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
