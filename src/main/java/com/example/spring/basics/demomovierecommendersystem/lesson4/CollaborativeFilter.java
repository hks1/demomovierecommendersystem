package com.example.spring.basics.demomovierecommendersystem.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Autowiring by Type

@Component
@Primary
public class CollaborativeFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        return new String[] {};
    }

}
