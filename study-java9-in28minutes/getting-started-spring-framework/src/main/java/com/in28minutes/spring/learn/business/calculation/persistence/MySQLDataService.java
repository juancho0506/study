package com.in28minutes.spring.learn.business.calculation.persistence;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Lazy //Using lazy initialization as this bean is rarely used.
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
