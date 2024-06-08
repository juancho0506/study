package com.in28minutes.spring.learn.context.business.calculation.persistence;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Second alternative to persistence and used often times.
 * Example of Lazy Initialization.
 */
@Component
@Lazy //Using lazy initialization as this bean is rarely used.
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
