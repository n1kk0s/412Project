
package PairAndStatus;

import java.util.ArrayList;

/**
 * This will handle the pairing of a BLE device with an Android phone.
 * 
 * @author jps5775
 */
public class BLEPairing {

    /**
     * 
     * Accepts and stores the ServiceUUID and CharacteristicID for later pairing.
     * @param ServiceUUID This is the ServiceUUID from the BLE device.
     * @param CharacteristicID This is the CharacteristicID from the BLE device.
     */
    public BLEPairing(String ServiceUUID, String CharacteristicID){
        
    }
    
    /**
     * Returns the ServiceUUID from the BLE device.
     * @return A string representing the ServcieUUID
     */
    public String getServiceUUID(){
        return "5154474C-9000-0101-0001-000000000001";
    }
    
    /**
     * Returns the CharacteristicID from the BLE device.
     * @return A string representing the CharacteristicID.
     */
    public String getCharacteristicID(){
        return "5154474C-9000-0101-0004-000000000000";
    }
    
    /**
     * This will find the connections that are avaliable.
     * @return A list of strings representing each possible connection
     */
    public ArrayList<String> findConnections(){
        return new ArrayList<>();
    }
    
    /**
     * Begins pairing the phone to the BLE device using the ServiceUUID and
     * the CharacteristicID.
     * @param ServiceUUID This is the ServiceUUID from the BLE device.
     * @param CharacteristicID This is the CharacteristicID from the BLE device.
     */
    public void startPairing(String ServiceUUID, String CharacteristicID){
        
    }
    /**
     * Ends pairing the phone to the BLE device.
     * @param ServiceUUID This is the ServiceUUID from the BLE device.
     * @param CharacteristicID This is the CharacteristicID from the BLE device.
     */
    public void endPairing(String ServiceUUID, String CharacteristicID){
        
    }
    
    /**
     * Checks if the pairing process was successful.
     * @return A boolean representing true if the BLE device is paired correctly
     * and false if the device is not paired. 
     */
    public boolean isPaired(){
        return true;
    }
    
    
}
