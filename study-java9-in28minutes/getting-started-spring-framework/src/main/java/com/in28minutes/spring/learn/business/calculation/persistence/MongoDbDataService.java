package com.in28minutes.spring.learn.business.calculation.persistence;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
