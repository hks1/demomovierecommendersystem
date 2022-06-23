package com.example.spring.basics.demomovierecommendersystem.lesson9;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * Constructor and Setter Injection
 */

@SpringBootApplication
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // ApplicationContext manages the beans and dependencies
	    ApplicationContext appContext = SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);

	    //create object of RecommenderImplementation class
	    // passing name of the filter as constructor argument
        //RecommenderImplementation recommendor = new RecommenderImplementation(filter);
	    //RecommenderImplementation recommendor = new RecommenderImplementation(new ContentBasedFilter());
	    // use ApplicationContext to find which filter is being used
	    //RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class); 
	    
	    // Retrieve singleton bean from application context thrice
	    ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
	    ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
	    ContentBasedFilter cbf3 = appContext.getBean(ContentBasedFilter.class);
        
        System.out.println(cbf1);
        System.out.println(cbf2);
        System.out.println(cbf3);
        
     // Retrieve prototype bean from application context thrice
        CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
        CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);
        
        System.out.println(cf1);
        System.out.println(cf2);
        System.out.println(cf3);
        
        
        
	}

}
