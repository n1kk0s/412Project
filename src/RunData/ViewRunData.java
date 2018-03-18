/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunData;

import PairAndStatus.*;

/**
 * This sets the actual screen for current run data and gets the information from RunCntl in order to
 * display the correct information to the user.
 * @author laurenritter
 */
public class ViewRunData {
    
    /**
     * This is the constructor that initially defines the objects.
     * @param runCntl This helps with getting the functioning from runCntl.
     */
    public ViewRunData(RunCntl runCntl){
        
    }
    
    /**
     * This method will help to customize the design of the view run data
     */
    public void initCustomComponents(){
        
    }
    
    /**
     * This will get the information that RunCntl obtained from the snowboard in order to implement 
     * it into the view.
     */
    public void getRunCntl(){
        
    }
    
    /**
     * This will switch between the various graphs in the view. The user will be able to chose if 
     * they would like to view how they are improving in speed, distance, duration, altitude, number 
     * of falls, or G-Force.
     */
    public void switchGraph(){
        
    }
    
    /**
     * This will get the status on battery level and other information for the top bar of the screen.
     * @param checkStatus This is pulled from the CheckStatus class in the PairAndStatus package.
     */
    public void statusUpdate(CheckStatus checkStatus){
        
    }
}
