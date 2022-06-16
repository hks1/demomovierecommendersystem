package com.example.spring.basics.demomovierecommendersystem.lesson1;

public class RecommenderImplementation {
    
    public String[] recommendMovies(String movie) {
        
        // use content based filter to find the similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        
        // return the results
        //return new String[] {"m1", "m2", "m3"};
        return results;
    }

}
