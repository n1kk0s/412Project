/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmergencyAlert;

/**
 *
 * @author Nick Weld
 */
public class EmergencyController {
    
    /**
     * This controls the communication between the view, model, and SMS portions of the Emergency Alert.
     */
    public EmergencyController() {
        
    }
    
    /**
     * This will send an SMS message from the Android phone containing location data.
     * The Android Location class methods getLattitude() and getLongitude() will be used here.
     * @param emergencyNumber This is the number for the ski patrol, inputted by the user.
     * @return Whether or not the alert was successfully sent.
     */
    public boolean SendAlert(int emergencyNumber) {
        boolean success = true;
        
        return true;
    }
    
    /**
     * This will be used to store the number for the ski patrol entered by the user.
     * @param number The number for the ski patrol entered by the user.
     */
    public void saveNumber(int number) {
        
    }
    
    /**
     * This populates the emergency contact number field with the last one that was entered.
     */
    public void retrieveLastNumber() {
        
    }
}
