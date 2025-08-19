package com.example.Decorator.Pattern.example3.controller;

import com.example.Decorator.Pattern.example3.dto.BeverageRequest;
import com.example.Decorator.Pattern.example3.model.Beverage;
import com.example.Decorator.Pattern.example3.service.BeverageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/coffee")
public class BeverageController {

    private final BeverageService beverageService;

    public BeverageController(BeverageService beverageService) {
        this.beverageService = beverageService;
    }

    @PostMapping("/order")
    public ResponseEntity<?> order(@RequestBody BeverageRequest request){

        try{
            Beverage beverage = beverageService.buildBeverage(request.getBase(), request.getDecorators());
            return ResponseEntity.ok(Map.of(
                    "description", beverage.getDescription(),
                    "cost", beverage.getCost()
            ));

        }catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));

        }
    }
}
