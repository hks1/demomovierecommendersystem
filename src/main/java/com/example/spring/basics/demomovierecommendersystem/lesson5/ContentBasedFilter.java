package com.example.spring.basics.demomovierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        
        // logic of content based filter
        
        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
