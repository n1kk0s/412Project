/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AggregateRunData;

/**
 *
 * @author Gino
 */

import java.security.Timestamp;
import java.util.ArrayList;
/**
 * This class handles grabbing data and putting to the view class
 */
public class AggRunDataCntl {

    public AggRunDataCntl() {
        
    }
    
    /**
     * This will take the ArrayList all of the speeds from past runs and place them into a graph. 
     * @param pastSpeeds This is an ArrayList of the past speeds from other runs.
     * @param userSelection Time selected to view data
     */
     public void aggSpeedGraph(ArrayList pastSpeeds, Timestamp userSelection){
        
    }
    
    /**
     * This will take the ArrayList of all of the distances traveled from past runs and put them 
     * @param pastDistances This is an ArrayList of the past distances from other runs.
     * @param userSelection Time selected to view data
     */
    public void aggDistanceGraph(ArrayList pastDistances, Timestamp userSelection){
        
    }
    
    /**
     * This gets the ArrayList of the of all of the durations of past runs and puts them into a 
     * @param pastDurations This is an ArrayList of the durations of other runs.
     * @param userSelection Time selected to view data
     */
    public void aggDurationGraph(ArrayList pastDurations, Timestamp userSelection){
        
    }
    
    /**
     * This gets the ArrayList of all of the G-Forces of past runs and puts them into a graph. This 
     * @param pastGForces This is an ArrayList of the G-Forces from past runs.
     * @param userSelection Time selected to view data
     */
    public void aggGForceGraph(ArrayList pastGForces, Timestamp userSelection){
        
    }
    
    /**
     * This will get the ArrayList of all the falls from past runs and place them into a graph. This
     * @param pastFalls This is an ArrayList of all of the falls from other runs.
     * @param userSelection Time selected to view data
     */
    public void aggFallGraph(ArrayList pastFalls, Timestamp userSelection){
        
    }
    
    /**
     * This will get the maximum altitude from past runs and place them into a graph. This is simply 
     * @param pastAltitudes This is an ArrayList of all past maximum altitudes from other runs.
     * @param userSelection Time selected to view data
     */
    public void aggAltitudeGraph(ArrayList pastAltitudes, Timestamp userSelection){
        
    }
    
    
    
}
