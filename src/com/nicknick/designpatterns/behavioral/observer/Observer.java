package com.nicknick.designpatterns.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}