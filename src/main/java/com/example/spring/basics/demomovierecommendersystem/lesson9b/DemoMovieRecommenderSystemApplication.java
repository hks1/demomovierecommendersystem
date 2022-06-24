package com.example.spring.basics.demomovierecommendersystem.lesson9b;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * Constructor and Setter Injection
 */

// @ComponentScan
// collaborativeFilter form another package is not found

// check lesson9c for the use of @ComponentScan(basePackage = "...")

@SpringBootApplication
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // ApplicationContext manages the beans and dependencies
	    ApplicationContext appContext = SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);

		    
	    System.out.println("ContentBasedFilter bean found = " + appContext.containsBean("contentBasedFilter"));
	    
	    System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));
	    
	    /*
	    String[] allBeanNames = appContext.getBeanDefinitionNames();
	    for(String beanName : allBeanNames) {
	        System.out.println(beanName);
	    }
	    */
	}

}

// Mixing Bean Scope

// When a prototype bean is injected into a singleton bean, it loses its prototype behavior and acts as a singleton.

// This problem can be solved in a number of ways. One of them is by using a proxy. We  using the proxyMode element inside the @Scope annotation.
// @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)