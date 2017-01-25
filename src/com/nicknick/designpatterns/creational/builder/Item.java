package com.nicknick.designpatterns.creational.builder;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}