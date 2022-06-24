package com.example.spring.basics.demomovierecommendersystem.lesson13;

import java.util.Arrays;

import javax.annotation.processing.SupportedAnnotationTypes;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * Autowiring - @Qualifier
 */

//@SpringBootApplication
@Configuration
@ComponentScan
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // ApplicationContext manages the beans and dependencies
	    /* Change this:
	    ApplicationContext appContext = SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    */
	    
	    // to this:
	    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DemoMovieRecommenderSystemApplication.class);

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
