package com.example.spring.basics.demomovierecommendersystem.lesson12;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Autowiring by name

//@Component
@Named
public class RecommenderImplementation {
    
    // use filter interface to select filter
    //@Autowired
    @Inject
    @Qualifier("CF")
    private Filter filter;
    
    /*
    public RecommenderImplementation(Filter filter) {
        super();
        this.contentBasedFilter = filter;
    }
    */
    
    public Filter getFilter() {
        return filter;
    }
    
    // use a filter to find the recommendations
    public String[] recommendMovies(String movie) {
        
        // use content based filter to find the similar movies
        //ContentBasedFilter filter = new ContentBasedFilter();
        //CollaborativeFilter filter = new CollaborativeFilter();
        //Filter filter = new ContentBasedFilter();
        
        // print the name of interface implementation being used
        //System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");
        System.out.println("Name of the filter in use: " + filter + "\n");
        //String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        String[] results = filter.getRecommendations("Finding Dory");
        
        // return the results
        //return new String[] {"m1", "m2", "m3"};
        return results;
    }

}
