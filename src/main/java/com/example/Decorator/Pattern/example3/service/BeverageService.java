package com.example.Decorator.Pattern.example3.service;

import com.example.Decorator.Pattern.example3.model.Beverage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BeverageService {

    private final Map<String, Beverage> baseBeverages;
    private final BeverageDecoratorFactory beverageDecoratorFactory;

    public BeverageService(Map<String,Beverage> baseBeverages,BeverageDecoratorFactory beverageDecoratorFactory){
        this.baseBeverages=baseBeverages;
        this.beverageDecoratorFactory=beverageDecoratorFactory;
    }

    public Beverage buildBeverage(String baseName, List<String> decorators){

        Beverage beverage = baseBeverages.get(baseName);
        if(beverage ==null)
            throw new IllegalArgumentException("not found");
        else
            for (String decoratorName : decorators) {
                beverage = beverageDecoratorFactory.getDecorator(decoratorName, beverage);
            }

        return beverage;
    }
}
