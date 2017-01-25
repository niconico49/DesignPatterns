package com.nicknick.designpatterns.creational.singleton;

public class Singleton {

    //create an object of SingleObject
    private static Singleton singleton = new Singleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){}

    //Get the only object available
    public static Singleton getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}