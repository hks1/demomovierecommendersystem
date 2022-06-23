package com.example.spring.basics.demomovierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;


// Scope is singleton by default
@Component
//@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        
        // logic of content based filter
        
        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
