package com.example.spring.basics.demomovierecommendersystem.lesson15;

import java.util.Arrays;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // ApplicationContext manages the beans and dependencies
	    ApplicationContext appContext = SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // check the beans which have been loaded
	    System.out.println("\nBeans loaded: ");
	    System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

	    // use ApplicationContext to find which filter is being used
	    RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class); 
	    
	    String favoriteMovie = recommender.getFavoriteMovie();
	    System.out.println(favoriteMovie);
	    
	    // print dependency
	    System.out.println("\nDependency" + recommender.getFilter());
        
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
