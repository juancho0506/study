package com.in28minutes.spring.learn.business.calculation;

import com.in28minutes.spring.learn.business.calculation.service.BusinessCalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculatorLauncher {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(BusinessCalculatorLauncher.class)
        ) {
            BusinessCalculatorService service = context.getBean(BusinessCalculatorService.class);
            System.out.println(service.findMax());
        }
    }
}
