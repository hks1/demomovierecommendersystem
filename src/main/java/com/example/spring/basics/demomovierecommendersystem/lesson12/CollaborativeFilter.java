package com.example.spring.basics.demomovierecommendersystem.lesson12;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component
@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }

}
