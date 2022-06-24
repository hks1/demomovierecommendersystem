package com.example.spring.basics.demomovierecommendersystem.lesson13;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * Autowiring - @Qualifier
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
	    RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class); 
        
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");
        
        // display results
        System.out.println(Arrays.toString(result));
	}

}

/*
 * Spring Boot -> Spring
 * 
 * replace spring-boot-starter dependency in the pom.xml with spring-core
 * 
 * add spring-context dependency -> to use ApplicationContext
 * 
 *
 *
 */ 
