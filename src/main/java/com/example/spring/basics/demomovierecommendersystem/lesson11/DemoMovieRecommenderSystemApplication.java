package com.example.spring.basics.demomovierecommendersystem.lesson11;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * Bean Lifecycle
 * @PostConstruct, 
 * @PreDestroy
 */
// Spring manages the entire lifecycle of singleton means but it doesn't completely manage the lifecycle of prototype beans.
// in case of prototype beans, application is responsible for destroying the bean and free up any resources it has acquired.

// introducing slf4j for logging

@SpringBootApplication
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // ApplicationContext manages the beans and dependencies
	    ApplicationContext appContext = SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);

	    // use ApplicationContext to find which filter is being used
	    RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class); 
	    
	    System.out.println(recommender);
	    
	    // Retrieving prototype from application context twice
	    Movie m1 = appContext.getBean(Movie.class);
	    System.out.println(m1);
	    
	    Movie m2 = appContext.getBean(Movie.class);
	    System.out.println(m2);
        
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");
        
        // display results
        System.out.println(Arrays.toString(result));
	}

}

