package com.example.spring.basics.demomovierecommendersystem.lesson13;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }

}
