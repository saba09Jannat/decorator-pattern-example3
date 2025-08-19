package com.example.Decorator.Pattern.example3.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Mocha")
@Scope("prototype")
public class MochaDecorator extends CondimentDecorator{

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost()+ 8.0;
    }
}
