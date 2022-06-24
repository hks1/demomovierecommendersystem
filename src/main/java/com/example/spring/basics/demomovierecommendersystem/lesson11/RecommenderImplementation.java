package com.example.spring.basics.demomovierecommendersystem.lesson11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class RecommenderImplementation {
    
    // introducing slf4j
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    // use filter interface to select filter
    @Autowired
    @Qualifier("CF")
    private Filter filter;
    
    /*
    public RecommenderImplementation(Filter filter) {
        super();
        this.contentBasedFilter = filter;
    }
    */
    
    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }
    
    // use a filter to find the recommendations
    public String[] recommendMovies(String movie) {
        
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        //String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        String[] results = filter.getRecommendations("Finding Dory");
        
        // return the results
        //return new String[] {"m1", "m2", "m3"};
        return results;
    }
    
    @PostConstruct
    private void postConstruct() { // can have any name
        // initialization code
        logger.info("In RecommenderImplementation postConstruct method");
    }
    
    @PreDestroy
    public void preDestroy() {
        // cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }
    

}
