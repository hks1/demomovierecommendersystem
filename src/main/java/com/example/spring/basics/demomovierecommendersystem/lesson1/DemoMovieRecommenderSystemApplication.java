package com.example.spring.basics.demomovierecommendersystem.lesson1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoMovieRecommenderSystemApplication.class, args);

	    //create object of RecommenderImplementation class
        RecommenderImplementation recommendor = new RecommenderImplementation();
        
        //call method to get recommendations
        String[] result = recommendor.recommendMovies("Finding Dory");
        
        // display results
        System.out.println(Arrays.toString(result));
	}

}
