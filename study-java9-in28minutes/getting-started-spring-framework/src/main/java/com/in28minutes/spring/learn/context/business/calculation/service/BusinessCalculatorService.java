package com.in28minutes.spring.learn.context.business.calculation.service;

import com.in28minutes.spring.learn.context.business.calculation.persistence.DataService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculatorService {
    private final DataService dataService;

    public BusinessCalculatorService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
