package com.example.Decorator.Pattern.example3.model;

public abstract class CondimentDecorator implements Beverage{

    protected Beverage beverage;

    public void setBeverage(Beverage b){
        beverage=b;
    }
}
