package com.example.spring.basics.demomovierecommendersystem.lesson2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);
	    
	    // create filter
	    //Filter filter = new ContentBasedFilter();
	    Filter filter = new CollaborativeFilter();

	    //create object of RecommenderImplementation class
	    // passing name of the filter as constructor argument
        //RecommenderImplementation recommendor = new RecommenderImplementation(filter);
	    RecommenderImplementation recommendor = new RecommenderImplementation(new ContentBasedFilter());
        
        //call method to get recommendations
        String[] result = recommendor.recommendMovies("Finding Dory");
        
        // display results
        System.out.println(Arrays.toString(result));
	}

}
