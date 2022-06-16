package com.example.spring.basics.demomovierecommendersystem.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        return new String[] {};
    }

}
