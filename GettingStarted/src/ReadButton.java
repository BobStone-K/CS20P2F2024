//Add Phidgets Library 
import com.phidget22.*;
public class ReadButton {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput greenButton = new DigitalInput();

        //Address 
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        greenButton.open(1000);

        //Use your Phidgets 
        while(true){
        	if(greenButton.getState()) {
        		 System.out.println("Button State: " + greenButton.getState());
        	}   
        	Thread.sleep(500);
        }
    }
}