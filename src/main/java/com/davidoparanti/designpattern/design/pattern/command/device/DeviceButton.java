package com.davidoparanti.designpattern.design.pattern.command.device;

import com.davidoparanti.designpattern.design.pattern.command.commands.Command;

public class DeviceButton {
    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
    public void undo() {
        command.undo();
    }
}
