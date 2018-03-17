/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoProController;

/**
 *
 * @author Wesley Mauk
 */
public class GoProController {
    
    
    /**
     * This controls communication with the GoPro camera and the GoPro view.
     */
    public GoProController()
    {
        
    }
    
    
    /**
     * This will launch the process for connecting to a GoPro camera. 
     */
    public void connectToGoPro()
    {
        
    }
    
    /**
     * This starts the camera recording.
     */
    public void startRecording()
    {
        
    }
    
    /**
     * This stops the camera recording.
     */
    public void stopRecording()
    {
        
    }
    
    /**
     * This sets the resolution and fps of the camera. The resolution and fps are set simultaneously because they depend on each other.
     * @param resolution The desired resolution to set.
     * @param fps The desired fps to set.
     * @return If the resolution and fps were set correctly, this returns true. 
     */
    public boolean setResolutionFPS(String resolution, String fps)
    {
        boolean success = true;
        
        return success;
    }
    
    /**
     * This sets the fov of the camera.
     * @param fov The desired fov to set.
     * @return If the fov was set correctly, this returns true.
     */
    public boolean setFov(String fov)
    {
        boolean success = true;
        
        return success;
    }
    
}
