package com.example.Decorator.Pattern.example3.model;

import org.springframework.stereotype.Component;

@Component("HouseBlend")
public class HouseBlend implements Beverage{

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
