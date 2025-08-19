package com.example.Decorator.Pattern.example3.service;

import com.example.Decorator.Pattern.example3.model.Beverage;
import com.example.Decorator.Pattern.example3.model.CondimentDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeverageDecoratorFactory {

    @Autowired
    private ApplicationContext applicationContext;

    public CondimentDecorator getDecorator(String name, Beverage beverage){
        CondimentDecorator decorator =
                (CondimentDecorator) applicationContext.getBean(name);

       decorator.setBeverage(beverage);
       return  decorator;
    }
}
