/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunData;

import PairAndStatus.*;
import java.util.ArrayList;

/**
 * The RunCntl will get and set the information related to each individual run from the snowboard 
 * and place it into the application. The user will be able to see how well they did in varying 
 * categories on their run including: speed, distance, duration, G-Force, number of falls and 
 * altitude obtained. This information will feed into the ViewRunData class where the frame and 
 * panels for display will be made.
 * @author laurenritter
 */
public class RunCntl {
    
    public RunCntl(BLEPairing blePairing){
        
    }
    
    /**
     * This will get the speed from the snowboard for the current run.
     */
    public void getSpeed(){
        
    }
    
    /**
     * This sets the speed in the application for the current run.
     */
    public void setSpeed(){
        
    }
    
    
    /**
     * This gets the distance from the snowboard for the current run.
     */
    public void getDistance(){
        
    }
    
    /**
     * This sets the speed in the application for the current run.
     */
    public void setDistance(){
        
    }
    
    /**
     * This gets the duration for the current run from the snowboard.
     */
    public void getDuration(){
        
    }
    
    /**
     * This sets the duration for the current run in the application.
     */
    public void setDuration(){
        
    }
    
    /**
     * This gets the number of falls in the current run from the snowboard.
     */
    public void getFalls(){
        
    }
    
    /**
     * This sets the number of falls in the current run to the application.
     */
    public void setFalls(){
        
    }
    
    /**
     * This will get the maximum G-Force achieved in the current run from the snowboard.
     */
    public void getGForce(){
        
    }
    
    /**
     * This will set the maximum G-Force in the application for the current run.
     */
    public void setGForce(){
        
    }
    
    /**
     * This gets the maximum altitude from the current run from the snowboard.
     */
    public void getAltitude(){
        
    }
    
    /**
     * This sets the maximum altitude from the current run in the application.
     */
    public void setAltitude(){
        
    }
    
    /**
     * This will take the ArrayList all of the speeds from past runs and place them into a graph. 
     * This is simply a brief overview before the user looks into the details of their averages 
     * in the view aggregate data.
     * @param pastSpeeds This is an ArrayList of the past speeds from other runs.
     */
    public void improvementSpeedGraph(ArrayList pastSpeeds){
        
    }
    
    /**
     * This will take the ArrayList of all of the distances traveled from past runs and put them 
     * in a graph. This is simply a brief overview before the user looks into the details of their 
     * averages in the view aggregate data.
     * @param pastDistances This is an ArrayList of the past distances from other runs.
     */
    public void improvementDistanceGraph(ArrayList pastDistances){
        
    }
    
    /**
     * This gets the ArrayList of the of all of the durations of past runs and puts them into a 
     * graph. This is simply a brief overview before the user looks into the details of their 
     * averages in the view aggregate data.
     * @param pastDurations This is an ArrayList of the durations of other runs.
     */
    public void improvementDurationGraph(ArrayList pastDurations){
        
    }
    
    /**
     * This gets the ArrayList of all of the G-Forces of past runs and puts them into a graph. This 
     * is simply a brief overview before the user looks into the details of their averages in the 
     * view aggregate data.
     * @param pastGForces This is an ArrayList of the G-Forces from past runs.
     */
    public void improvementGForceGraph(ArrayList pastGForces){
        
    }
    
    /**
     * This will get the ArrayList of all the falls from past runs and place them into a graph. This
     * is simply a brief overview before the user looks into the details of their averages in the 
     * view aggregate data.
     * @param pastFalls This is an ArrayList of all of the falls from other runs.
     */
    public void improvementFallGraph(ArrayList pastFalls){
        
    }
    
    /**
     * This will get the maximum altitude from past runs and place them into a graph. This is simply 
     * a brief overview before the user looks into the details of their averages in the view 
     * aggregate data.
     * @param pastAltitudes This is an ArrayList of all past maximum altitudes from other runs.
     */
    public void improvementAltitudeGraph(ArrayList pastAltitudes){
        
    }
}
