package com.example.spring.basics.demomovierecommendersystem.lesson14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class RecommenderImplementation {
    
    // use filter interface to select filter
    @Autowired
    @Qualifier("contentBasedFilter")
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
    
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    
    public RecommenderImplementation() {
        
    }
    
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
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

/*
 * Dependency Injection
 * 
 * using <property> tag
 * 
 *  using constructor injection
 */
