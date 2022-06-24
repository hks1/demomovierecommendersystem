package com.example.spring.basics.demomovierecommendersystem.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Service
public class ContentBasedFilter implements Filter {
    
    @Autowired
    private Movie movie;
    
    public ContentBasedFilter() {
        // TODO Auto-generated constructor stub
        super();
    }
    
    public String[] getRecommendations(String movie) {
        
        // logic of content based filter
        
        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
