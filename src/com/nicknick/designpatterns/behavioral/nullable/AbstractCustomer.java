package com.nicknick.designpatterns.behavioral.nullable;

public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}