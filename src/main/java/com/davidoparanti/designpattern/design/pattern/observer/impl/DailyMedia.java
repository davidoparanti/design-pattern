package com.davidoparanti.designpattern.design.pattern.observer.impl;

import com.davidoparanti.designpattern.design.pattern.observer.Observer;
import com.davidoparanti.designpattern.design.pattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class DailyMedia implements Subject {

    private final List<Observer> observers;
    private String message;

    public DailyMedia() {
        this.observers = new ArrayList<>();

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.updateMessage(message);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
