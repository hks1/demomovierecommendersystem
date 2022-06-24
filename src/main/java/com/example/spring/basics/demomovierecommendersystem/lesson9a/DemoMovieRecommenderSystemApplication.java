package com.example.spring.basics.demomovierecommendersystem.lesson9a;

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

		    
	    // Retrieve singleton bean from application context 
	    ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
	    
	    System.out.println("\n ContentBasedFilter bean with singleton scope");
        System.out.println(filter);
        
     // Retrieve prototype bean from the singleton bean thrice
        Movie movie1 = filter.getMovie();
        Movie movie2 = filter.getMovie();
        Movie movie3 = filter.getMovie();
        
        System.out.println("\nMovie bean with prototype scope");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        
        // Print number of instances of each bean
        System.out.println("\nContentBasedFilter instances created: "+ ContentBasedFilter.getInstances());
        System.out.println("Movie instances created: "+ Movie.getInstances());
	}

}

// Mixing Bean Scope

// When a prototype bean is injected into a singleton bean, it loses its prototype behavior and acts as a singleton.

// This problem can be solved in a number of ways. One of them is by using a proxy. We  using the proxyMode element inside the @Scope annotation.
// @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)