package com.example.Decorator.Pattern.example3.dto;

import  java.util.List;

public class BeverageRequest {

    private String base;
    private List<String> decorators;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<String> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<String> decorators) {
        this.decorators = decorators;
    }
}
