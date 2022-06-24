package com.example.spring.basics.demomovierecommendersystem.lesson9a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;


// Scope is singleton by default
@Component
//@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    
    // for keeping track of instances created
    private static int instances = 0;
    
    @Autowired
    private Movie movie;
    
    public ContentBasedFilter() {
        super();
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }
    
    public Movie getMovie() {
        return movie;
    }
    
    public static int getInstances() {
        return ContentBasedFilter.instances;
    }
    
    public String[] getRecommendations(String movie) {
        
        // logic of content based filter
        
        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
