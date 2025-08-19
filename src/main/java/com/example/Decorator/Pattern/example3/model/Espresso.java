package com.example.Decorator.Pattern.example3.model;

import org.springframework.stereotype.Component;

@Component("Espresso")
public class Espresso implements Beverage{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
