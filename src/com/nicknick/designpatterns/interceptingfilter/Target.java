package com.nicknick.designpatterns.interceptingfilter;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}