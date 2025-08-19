package com.example.Decorator.Pattern.example3.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Milk")
@Scope("prototype")
public class MilkDecorator extends CondimentDecorator{


    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost()+7.0;
    }
}
