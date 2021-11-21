package com.davidoparanti.designpattern.design.pattern.command.control;

import com.davidoparanti.designpattern.design.pattern.command.device.ElectronicDevice;
import com.davidoparanti.designpattern.design.pattern.command.device.Television;

public class TvRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
