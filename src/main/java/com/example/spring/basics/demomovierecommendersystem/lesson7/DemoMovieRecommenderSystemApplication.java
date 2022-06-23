package com.example.spring.basics.demomovierecommendersystem.lesson7;

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
	    
	    // RecommenderImplementation injects dependency using constructor
	    System.out.println("\n*************************************************");
	    System.out.println("Calling getBean() on RecommenderImplementation");
	    RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
	    String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
	    
	 // RecommenderImplementation2 injects dependency using setter method
        System.out.println("\n*************************************************");
        System.out.println("Calling getBean() on RecommenderImplementation2");
        RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
        result = recommender2.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
        
        
        
        
        //call method to get recommendations
        //String[] result = recommender.recommendMovies("Finding Dory");
        //String[] result = recommender2.recommendMovies("Finding Dory");
        
        // display results
        //System.out.println(Arrays.toString(result));
	}

}
