package com.davidoparanti.designpattern.design.pattern.command.control;

import com.davidoparanti.designpattern.design.pattern.command.commands.Command;
import com.davidoparanti.designpattern.design.pattern.command.commands.TurnItAllOff;
import com.davidoparanti.designpattern.design.pattern.command.commands.TurnTvOff;
import com.davidoparanti.designpattern.design.pattern.command.commands.TurnTvOn;
import com.davidoparanti.designpattern.design.pattern.command.device.DeviceButton;
import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;
import com.davidoparanti.designpattern.design.pattern.command.device.Radio;
import com.davidoparanti.designpattern.design.pattern.command.device.Television;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    public static void main(String[] args) {
        ElectronicDevice tv = TvRemote.getDevice();
        Command tvOn = new TurnTvOn(tv);
        DeviceButton onButton = new DeviceButton(tvOn);
        onButton.press();
        onButton.undo();

        System.out.println();

        Command tvOff = new TurnTvOff(tv);
        DeviceButton ofButton = new DeviceButton(tvOff);
        ofButton.press();
        ofButton.undo();

        System.out.println();
        List<ElectronicDevice> devices = new ArrayList<>();
        Television tvv = new Television();
        Radio radio = new Radio();
        devices.add(tvv);
        devices.add(radio);

        Command command = new TurnItAllOff(devices);
        DeviceButton offButton = new DeviceButton(command);
        offButton.press();
        offButton.undo();
    }
}
