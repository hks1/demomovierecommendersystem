package com.example.spring.basics.demomovierecommendersystem.lesson10;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Qualifier("CF")
@Scope("prototype")
public class CollaborativeFilter implements Filter {
    
    public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }

}

/*
 * 2 ways to define prototype scope
option 1
@Scope("prototype")

Option 2 
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 */
