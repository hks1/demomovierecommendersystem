package com.example.spring.basics.demomovierecommendersystem.lesson14;

import java.util.Arrays;

import javax.annotation.processing.SupportedAnnotationTypes;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // ApplicationContext manages the beans and dependencies
	    /* Change this:
	    ApplicationContext appContext = SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    */
	    
	    // to this:
	    //AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DemoMovieRecommenderSystemApplication.class);
	    
	    // --XML Application Configuration
	    // XML  Configuration with Java annotations
	    // The recommenderImpl bean is declared in appContext.xml while its dependency is declared using @Component annotation.
	    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
	    
	    // check the beans which have been loaded
	    System.out.println("\nBeans loaded: ");
	    System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

	    // use ApplicationContext to find which filter is being used
	    //RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class); 
	    
	    // XML Application Configuration
	    RecommenderImplementation recommender = appContext.getBean("recommenderImpl", RecommenderImplementation.class);
	    
	    // print dependency
	    System.out.println("\nDependency" + recommender.getFilter());
        
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");
        
        // display results
        System.out.println(Arrays.toString(result));
        
        appContext.close();
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
