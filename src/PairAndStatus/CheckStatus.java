
package PairAndStatus;

/**
 *
 * This class will handle checking the status of your BLE device, detect
 * if data is being received and check for the BLE device's battery status
 * with an Android phone.
 * 
 * @author jps5775
 */
public class CheckStatus {
    
    /**
     * Default constructor
     */
    public CheckStatus(){
        
    }
    
    /**
     * Receives data and checks it for its validity.
     * @param payload The 16-byte payload received from the BLE device.
     * @return Returns true if data is currently being received and false
     * if the data is not received.
     */
    public boolean isRecievingData(String payload){
        return true;
    }
    
    /**
     * Parses the 16-byte payload coming and finds the battery status of the 
     * BLE device.
     * @return A Double representing the Battery Status.
     */
    public Double parseDataForBatteryStatus(){
        return 0.0;
    }
    
    /**
     * Returns a 16-byte data packet received from the BLE device.
     * @return A String representing the 16-byte payload.
     */
    public String getPayload(){
        return "0x8401beffa30ffbffd5fff4ffa7ff0000"; 
    }
    
}
