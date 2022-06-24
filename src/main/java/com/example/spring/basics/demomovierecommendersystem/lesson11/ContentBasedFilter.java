package com.example.spring.basics.demomovierecommendersystem.lesson11;

import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }
    
    @PostConstruct
    private void postConstruct() {
       // load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }
    
    @PreDestroy
    private void preDestroy() {
        // clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }
    
    public String[] getRecommendations(String movie) {
        
        // logic of content based filter
        
        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
