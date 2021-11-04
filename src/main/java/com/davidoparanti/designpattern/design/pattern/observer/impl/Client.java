package com.davidoparanti.designpattern.design.pattern.observer.impl;

import com.davidoparanti.designpattern.design.pattern.observer.Observer;

public class Client implements Observer {
    private String name;
    private String message;

    public Client(String name) {
        this.name = name;
    }

    public String getMessage() {
        return String.format("%s says %s", name, message);

    }
    @Override
    public void updateMessage(String message) {
        this.message = message;
    }
}
